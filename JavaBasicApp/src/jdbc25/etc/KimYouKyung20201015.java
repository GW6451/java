package jdbc25.etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import jdbc25.service.IConnectImpl;

public class KimYouKyung20201015 extends IConnectImpl {
	
	public KimYouKyung20201015() {
		super(ORACLE_URL,"JDBC","JDBC");
	}
	@Override
	public void execute() throws Exception {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MM월 dd HH:mm:ss yyyy");
        
		while(true) {
			//1]쿼리문 준비
			String query = getQueryString();
			
			if("EXIT".equalsIgnoreCase(query.trim())) {
				System.out.println("Oracle Database 11g Enterprise Edition Release 11.2.0.1.0 - 64bit Production\r\n" + 
						"With the Partitioning, OLAP, Data Mining and Real Application Testing options에서 분리되었습니다.");
				//자원반납
				close();
				//프로그램 종료
				System.exit(0);
			}
			
			if(query.toUpperCase().startsWith("SQLPLUS")) {
				if(query.contains("/")) {
					String user = query.substring(query.toUpperCase().indexOf("SQLPLUS")+7, query.indexOf("/")).toUpperCase().trim();
					String password = query.substring(query.indexOf("/")+1).trim();
					try {
						conn = DriverManager.getConnection(ORACLE_URL,user,password);
						System.out.println("SQL*Plus: Release 11.2.0.1.0 Production on "+dateFormat.format(today)+"\r\n" +	"\r\n" + 
								"Copyright (c) 1982, 2010, Oracle.  All rights reserved.\r\n" + 
								"\r\n" + "\r\n" + "다음에 접속됨:\r\n" + 
								"Oracle Database 11g Enterprise Edition Release 11.2.0.1.0 - 64bit Production\r\n" + 
								"With the Partitioning, OLAP, Data Mining and Real Application Testing options\r\n" + 
								"");
					}
					catch(SQLException e) {
						System.out.println("연결 실패하였습니다 : "+e.getMessage());
					}									
				}
			}//startsWith("SQLPLUS")
			
			
			if(query.toUpperCase().startsWith("CONN")) {
				if(query.contains("/")) {
					String user = query.substring(query.toUpperCase().indexOf("CONN")+4, query.indexOf("/")).toUpperCase().trim();
					String password = query.substring(query.indexOf("/")+1).trim();
					try {
						conn = DriverManager.getConnection(ORACLE_URL,user,password);
						System.out.print(user+":"+password);
						System.out.println("연결되었습니다.");
					}
					catch(SQLException e) {
						System.out.println("연결 실패하였습니다 : "+e.getMessage());
					}
				}
				else if("CONN".equalsIgnoreCase(query.trim())) {
					System.out.print("사용자명 입력: ");
					String user = sc.nextLine().trim();
					System.out.print("비밀번호 입력: ");
					String password = sc.nextLine().trim();
					try {
						conn =  DriverManager.getConnection(ORACLE_URL,user,password);
						System.out.println("연결되었습니다.");
						System.out.println(user+":"+password);
					}
					catch(SQLException e) {
						System.out.println("연결 실패하였습니다 : "+e.getMessage());
					}
				}
				else {
					String user = query.substring(query.toUpperCase().indexOf("CONN")+4).trim();
					System.out.print("비밀번호 입력: ");
					String password = sc.nextLine().trim();
					try {
						conn = DriverManager.getConnection(ORACLE_URL,user,password);
						System.out.println("연결되었습니다.");
						System.out.println(user+":"+password);
					}
					catch(SQLException e) {
						System.out.println("연결 실패하였습니다 : "+e.getMessage());
					}
				}
				continue;
				
			}///startsWith("CONN")
			
			
			while(!query.contains(";")){
	        	 query = query + getQueryString() + " ";	
	         }
	         if(query.contains(";")){
	            query = query.replace(";", " ").trim(); 
	         }
			//2]Statement계열 객체 생성 - 쿼리 실행용	        
			psmt = conn.prepareStatement(query);
			
			//3]쿼리 실행-boolean execute() : 쿼리문이 미정임으로
			try {
				boolean flag = psmt.execute();
				if(flag) {//쿼리문이 select
					//ResultSet 객체 얻기
					rs = psmt.getResultSet();
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();					
					List<Integer> dashCount = new Vector<Integer>();
					for(int i=1;i<=columnCount; i++) {
						//컬럼타입]
						int types = rsmd.getColumnType(i);
						//컬럼의 자리수]
						int length = rsmd.getPrecision(i);
						switch(types) {
							case Types.NCHAR:
							case Types.NVARCHAR:
								dashCount.add(length*2); break;
							case Types.TIMESTAMP:
							case Types.NUMERIC:
								dashCount.add(10); break;
							default: dashCount.add(length);
						}////switch
						String columnName = rsmd.getColumnName(i).length()>dashCount.get(i-1)?
											rsmd.getColumnName(i).substring(0, dashCount.get(i-1)):
											rsmd.getColumnName(i);
						System.out.print(String.format("%-"+(dashCount.get(i-1)+1)+"s", columnName));
					}////for
					System.out.println();//줄바꿈
					//(-)DASH출력]
					for(Integer dash:dashCount) {
						for(int i=0;i<dash;i++) System.out.print("-");
						System.out.print(" ");
					}
					System.out.println();//줄바꿈
					//데이터 출력]
					while(rs.next()) {
						//각 컬럼값 뽑아오기
						for(int i=1;i<columnCount;i++) {
							int type = rsmd.getColumnType(i);
							if(type == Types.TIMESTAMP) {
								System.out.print(String.format("%-11s",rs.getDate(i)));
							}
							else {
								System.out.print(String.format("%-"+(dashCount.get(i-1))+"s",rs.getString(i)));
							}
						}
						System.out.println();//줄바꿈
					}
				}
				else {//기타 쿼리문
					int affected = psmt.getUpdateCount();
					if(query.trim().toUpperCase().startsWith("UPDATE")) {
						System.out.println(affected+"행이 수정되었어요");
					}
					else if(query.trim().toUpperCase().startsWith("DELETE")) {
						System.out.println(affected+"행이 삭제되었어요");
					}
					else if(query.trim().toUpperCase().startsWith("INSERT")) {
						System.out.println(affected+"행이 입력되었어요");
					}
				}
			}///try
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}///catch
		}///while
		
	}//execute
	

	public static void main(String[] args) throws Exception {
		KimYouKyung20201015 kyg = new KimYouKyung20201015();
		kyg.execute();
		
	}////main

}////////class
