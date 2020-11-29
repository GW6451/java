package jdbc25;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnectionPractice {

	public static void main(String[] args) {
		//Connection : 데이터베이스와 연결하는 객체(접속) : 일단 null값을 준다
		Connection conn = null;
		//Statement : sql구문을 실행하는 역할(sql관리) : 일단 null값을 준다
		Statement stmt = null;
		//ResultSet : select할때만 필요 결과를 담아야하므로 : 일단 null값을 준다
		ResultSet rs = null;
		//예외처리1
		try {
			/*Properties클래스 사용 : Properties 클래스는 영구 속성 집합을 나타냅니다. 
		     속성은 스트림에 저장하거나 스트림에서로드 할 수 있습니다. 속성 목록의 각 키와 해당 값은 문자열입니다.*/
			Properties prop = new Properties();
			//Properties 클래스에서 로드할 파일 가져오기
			prop.load(new FileReader("src/jdbc25/config.properties"));
			//Class.forName : 드라이버 로딩할때 쓴다
			Class.forName(prop.getProperty("driver"));
			//오라클 주소(url)]
			String url = prop.getProperty("url");
			//계정정보]
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			//드라이버 연결
			conn = DriverManager.getConnection(url,user,password);
			//연결확인
			System.out.println("연결 성공 : conn = "+conn);
			try {
			//쿼리문 연결한것을 stmt에 넣는다
			stmt = conn.createStatement();				
			//쿼리문 작성(고용날짜(내림차순)으로)
			String sql = "SELECT * FROM emp ORDER BY hiredate DESC";					
				try {
					//실행한 쿼리문의 결과를 Resultset타입의 변수에 넣는다
					rs = stmt.executeQuery(sql);
						//Resultset에 있는 레코드를 다 꺼내올때까지 반복(예외처리)
						while(rs.next()) {
							int empno = rs.getInt(1);
							String ename = rs.getNString(2);
							String job = rs.getNString("job");
							int sal = rs.getInt(6);
							Date hiredate = rs.getDate(5);
							System.out.println(
									String.format("%-5s%-10s%-10s%-10s%s", empno,ename,job,sal,hiredate));
						}
				}
				catch(SQLException e) {
					System.out.println("쿼리실행 실패 : " +e.getMessage() );
				}
			}
			catch(SQLException e) {
				System.out.println("Statement 객체생성 실패 : "+e.getMessage());
			}
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("오라클 드라이버 클래스가 없어요 : "+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 실패 : "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("파일이 존재하지 않아요 : " + e.getMessage());
		}
		finally {
			//레코드 꺼내오기가 끝나면 닫는다
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();			
			}
			catch(SQLException e) {
				
			}
		}
	}//////main

}///////class
