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
 
public class DBConnection {
	static Connection conn;
	static {
		conn =null;
		Properties props = new Properties();
		try {
			props.load(new FileReader("src/jdbc25/config.properties"));
			Class.forName(props.getProperty("driver"));
			String url = props.getProperty("url");//jdbc:oracle:thin오라클 주소
			String user=props.getProperty("user");
			String password = props.getProperty("password");
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("연결 성공 : conn="+conn);	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		//Connection : 데이터베이스와 연결하는 객체(접속)
//		Connection conn =null;
		//Statement : sql구문을 실행하는 역할(sql관리)
		Statement stmt = null;
		//ResultSet : select할때만 필요 결과를 담아야하므로
		ResultSet rs = null;
		try {
			//Properties클래스 사용
//			Properties props = new Properties();
			//Properties 클래스에서 연결할 파일 가져오기
//			props.load(new FileReader("src/jdbc25/config.properties"));
			//System.out.println(props.getProperty("driver"));
			/*
			 Class.forName : 드라이버 로딩할때 쓴다
			 주어진 문자열 이름을 가진 클래스 또는 인터페이스와 관련된 Class 객체를 반환합니다. 이 메서드를 호출하는 것은 다음과 같습니다.
			Class.forName (className, true, currentLoader)
			여기서 currentLoader는 현재 클래스의 정의 클래스 로더를 나타냅니다.
			
			예를 들어 다음 코드 조각은 java.lang.Thread라는 클래스에 대한 런타임 클래스 설명자를 반환합니다.			
			클래스 t = Class.forName ( "java.lang.Thread")			
			forName ( "X")을 호출하면 X라는 클래스가 초기화됩니다. 
			 */
			//getProperty : 이 속성 목록에서 지정된 키를 사용하여 속성을 검색합니다
//			Class.forName(props.getProperty("driver"));
			//오라클 주소]
//			String url = props.getProperty("url");//jdbc:oracle:thin오라클 주소
			//계정정보]
//			String user=props.getProperty("user");
//			String password = props.getProperty("password");
			//드라이버 연결
//			conn = DriverManager.getConnection(url,user,password);
			//연결확인
//			System.out.println("연결 성공 : conn="+conn);			
			try {
				//쿼리문 연결한것을 stmt에 넣는다
				stmt = conn.createStatement();
				//쿼리문 작성
				String sql ="SELECT * FROM emp ORDER BY hiredate DESC";
				try {
					//실행한 쿼리문의 결과를 Resultset타입의 변수에 넣는다
					rs = stmt.executeQuery(sql);
					//Resultset에 있는 레코드를 다 꺼내올때까지 반복
					while(rs.next()) {//next():더이상 꺼내올 레코드가 없으면 false반환
						int empno = rs.getInt(1);
						String ename = rs.getNString(2);
						String job = rs.getNString("job");
						int sal = rs.getInt(6);
						Date hiredate = rs.getDate(5);
						System.out.println(
								String.format("%-5s%-10s%-9s%-6d%s", empno,ename,job,sal,hiredate));
					}
				}
				catch(SQLException e) {
					System.out.println("쿼리 실행 실패:"+e.getMessage());
				}
			}
			catch(SQLException e) {
				System.out.println("Statement 객체 생성 실패:"+e.getMessage());
			}
		}
		finally {
			try {
				//레코드 꺼내오기가 끝나면 닫는다
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}
			catch(SQLException e) {
				
			}
		}
	}

}
