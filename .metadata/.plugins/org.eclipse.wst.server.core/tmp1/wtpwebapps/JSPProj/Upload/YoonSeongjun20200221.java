package jdbc25.etc;

import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import jdbc25.service.IConnectImpl;

public class YoonSeongjun20200221 extends IConnectImpl {
   
   public YoonSeongjun20200221()
   {
      super(ORACLE_URL, "USER01", "USER01");
   }
   
   @Override
   public void execute() throws Exception {
	   
	      Scanner sc = new Scanner(System.in);
	      Date today = new Date (); 
	
	      while(true)
	      {
		     if(startSQL().toUpperCase().equals("SQLPLUS"))
		     {
		    	 System.out.println("SQL*Plus: Release 11.2.0.1.0 Production on " + today +
		    	  	"\r\n" + 
		    	  	"Copyright (c) 1982, 2010, Oracle.  All rights reserved.");
		    	 break;
		     }
		     else
		     {
		    	 System.out.println("SQL 연결에 실패하였습니다");
		    	 continue;
		     }      
	      }

	      while(true)
	      {       	 	         
	         //1]쿼리문 준비
	         String query = getQueryString();
	         if(query.toUpperCase().startsWith("CONN", 0))
	         {
	        	 if(query.contains("/"))
	        	 {
	            	 String id = query.substring(query.toUpperCase().indexOf("CONN")+4, query.indexOf('/')).toUpperCase().trim();
	            	 String pwd = query.substring(query.indexOf("/")+1).trim();
	//            	 System.out.println(id + ":" + pwd);
	          		try 
	         		{
	        			DriverManager.getConnection(ORACLE_URL, id, pwd);
	        			System.out.println("연결되었습니다");
	        		}
	        		catch(SQLException e) 
	         		{
	        			System.out.println("연결 실패하였습니다");
	        		}
	        	 }
	        	 
	        	 else if("CONN".equalsIgnoreCase(query.trim()))
	             {
	            	 System.out.println("사용자명 입력: ");
	            	 String id = sc.nextLine().trim();
	            	 System.out.println("비밀번호 입력: ");
	            	 String pwd = sc.nextLine().trim();
	         		try 
	         		{
	        			DriverManager.getConnection(ORACLE_URL, id, pwd);
	        			System.out.println("연결되었습니다");
	        		}
	        		catch(SQLException e) 
	         		{
	        			System.out.println("연결 실패하였습니다");
	        		}
	            	 
	             }
	        	 
	        	 else
	        	 {
	            	 String id = query.substring(query.toUpperCase().indexOf("CONN")+4).toUpperCase().trim();
	            	 System.out.println("비밀번호 입력: ");
	            	 String pwd = sc.nextLine().trim();
	            	 
	           		try 
	         		{
	        			DriverManager.getConnection(ORACLE_URL, id, pwd);
	        			System.out.println("연결되었습니다");
	        		}
	        		catch(SQLException e) 
	         		{
	        			System.out.println("연결 실패하였습니다");
	        		}
	        	 }
	        	 continue;
	         }
	
	         if("EXIT".equalsIgnoreCase(query.trim()))
	         {
	            System.out.println("Oracle Database 11g Enterprise Edition Release 11.2.0.1.0 - 64bit Production\r\n" + 
	            		"With the Partitioning, OLAP, Data Mining and Real Application Testing options에서 분리되었습니다.");
	            //자원반납
	            close();
	            //시스템종료
	            System.exit(0);
	         }
	         while(!query.contains(";"))
	         {
	        	 query = query + getQueryString() + " ";	
	         }
	         if(query.contains(";"))
	         {
	            query = query.replace(";", " ").trim(); 
	         }
	         //2]StateMent 객체 생성 - 쿼리 실행용
	         psmt = conn.prepareStatement(query);
	       
	
	         //3]쿼리 실행 - execute():쿼리문이 미정 임으로 execute()메소드로 쿼리 실행 후 쿼리문이  SELECT인 경우 
	         //ResultSet에 담긴 결과를 가져오려면 Statement 계열객체의 getResultSet()메소드 호출
	         try
	         {
	            boolean bFlag = psmt.execute();
	            if(bFlag) //쿼리문이 SELECT
	            {
	               //ResultSet 객체 얻기]
	               rs = psmt.getResultSet();
	               ResultSetMetaData rsmd = rs.getMetaData();
	               int columnCount = rsmd.getColumnCount();
	               List<Integer> dashCount = new Vector<Integer>();
	               for(int i=1; i<=columnCount; i++)
	               {
	                  //컬럼타입
	                  int types = rsmd.getColumnType(i);
	                  //컬럼의 자리수
	                  int length = rsmd.getPrecision(i);
	                  
	                  switch(types)
	                  {
	                     case Types.NCHAR:
	                     case Types.NVARCHAR:
	                        dashCount.add(length*2);
	                     case Types.TIMESTAMP:
	                     case Types.NUMERIC:
	                        dashCount.add(10); break;
	                     default:dashCount.add(length);
	                  }
	                  String columName = rsmd.getColumnName(i).length() > dashCount.get(i-1) ? 
	                                 rsmd.getColumnName(i).substring(0,dashCount.get(i-1)) : 
	                                 rsmd.getColumnName(i);
	                  System.out.print(String.format("%-"+(dashCount.get(i-1)+1)+"s", columName));
	               }
	                  System.out.println();
	                  //(-)DASH출력
	                  for(Integer dash : dashCount)
	                  {
	                     for(int i=0; i<dash; i++) System.out.print("-");
	                     System.out.print(" ");
	                     
	                  }
	                  System.out.println();
	                  while(rs.next())
	                  {
	                     for(int i=1; i<=columnCount; i++)
	                     {
	                        int type = rsmd.getColumnType(i);
	                        if(type==Types.TIMESTAMP)
	                        {
	                           System.out.print(String.format("%-11s", rs.getDate(i)));
	                        }
	                        else
	                        {
	                           System.out.print(String.format("%-"+(dashCount.get(i-1)+1)+"s", rs.getString(i)));
	                        }
	                     }
	                     System.out.println();
	                  }
	               
	            }
	            else //기타 쿼리문
	            {
	               int affected = psmt.getUpdateCount();
	               if(query.trim().toUpperCase().startsWith("UPDATE"))
	               {
	                  System.out.println(affected+"행이 수정 되었습니다");
	               }
	               else if(query.trim().toUpperCase().startsWith("DELETE"))
	               {
	                  System.out.println(affected+"행이 삭제 되었습니다");
	               }
	               if(query.trim().toUpperCase().startsWith("INSERT"))
	               {
	                  System.out.println(affected+"행이 입력 되었습니다");
	               }
	               
	            }
	         }//try   
	         catch(SQLException e)
	         {
	            System.out.println(e.getMessage());
	         }
         }//while

}//execute
   
   public static void main(String[] args) throws Exception {
      new YoonSeongjun20200221().execute();

   }//MAIN

}/////CLASS