package jdbc25.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQLMore {
	//멤버변수]
	private Connection conn;
	private Statement stmt;
	//생성자]
	public DeleteSQLMore() {
		try {
		//1]JDBC용 오라클 드라이버 메모리에 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//2]오라클에 연결시도 :DriverManager의 getConnection()메소드로
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","JDBC","JDBC");//orcl -> 데이터베이스명
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없어요. 드라이버 로딩 실패");
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}
	}////DeleteSQL
	private void execute() {
		try {
			//3]쿼리 실행하기 위한 Statement객체 생성
			//	연결된 Connection객체로
			stmt = conn.createStatement();
			//4]Statement계열 객체로 쿼리 실행
			/*
			 * 쿼리문이 DELETE/UPDATE/INSERT일때는 int executeUpdate()
			 * 쿼리문이 SELECT일때는 ResultSet executeQuery()호출
			 */
			//executeUpdate()는 영향받은 행의 수 반환]
			while(true){
				try {
					int affected = stmt.executeUpdate("DELETE FROM MEMBER WHERE ID = '"+InsertSQLMore.getValue("삭제할 아이디").toString()+"'");
					System.out.println(affected + "행이 삭제되었습니다");
				}
				catch(SQLException e){
					System.out.println("DELETE쿼리문 실패 : "+e.getMessage());
				}
				catch(NullPointerException e) {
					System.out.println("수고하셨어요");
					break;
				}
			}
		}
		catch(SQLException e) {
			System.out.println("Statement객체 생성 실패");
		}		
		finally {
			//자원반납
			close();
		}
	}///execute	
	private void close() {
		try {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		catch(SQLException e) {}
	}

	public static void main(String[] args) {
		new DeleteSQLMore().execute();
	}///////main

	

}/////class DeleteSQL
