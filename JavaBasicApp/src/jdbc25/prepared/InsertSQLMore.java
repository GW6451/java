package jdbc25.prepared;

import java.sql.Date;
import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class InsertSQLMore extends IConnectImpl {
	
	public InsertSQLMore(String url,String user,String password) {
		connect(url,user,password);
	}/////InsertSQL	
	@Override
	public void execute() throws Exception {
		//1]쿼리문 미리준비
		
		String sql = "INSERT INTO member VALUES(?,?,?,SYSDATE)";//값 부분을 ?로 처리//sql에서는 인파라미터 인덱스가 1번
		
		//2]쿼리실행을 위한 Statement계열 객체 생성
		psmt = conn.prepareStatement(sql);	
		while(true) {
			//3]쿼리문 실행 - 인파라미터 설정
			psmt.setString(1,getValue("아이디"));
			psmt.setString(2,getValue("비밀번호"));
			psmt.setString(3,getValue("이름"));
			//날짜를 문자열로 입력받는다
			//psmt.setNString(4, getValue("가입일"));
			//날짜를 java.sql.Date타입으로 설저시]
//			java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
//			psmt.setDate(4, date);
			try {
				System.out.println(psmt.executeUpdate()+"행이 입력되었어요");
			}
			catch(SQLException e) {
				System.out.println("입력시 오류 : "+e.getMessage());
			}
			finally {
				//4]자원반납
				close();
			}
		}
	}////execute	
	public static void main(String[] args) throws Exception {
		new InsertSQL(ORACLE_URL,"JDBC","JDBC").execute();
	}//////main

}///////class
