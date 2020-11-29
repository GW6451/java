package jdbc25.statement;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class UpdateSQLMore extends IConnectImpl {	
	
	@Override
	public void execute() throws Exception {
		//0]데이터베이스 연결
		connect(ORACLE_URL,"JDBC","JDBC");
		//1]쿼리 전송용 Statement객체 생성
		stmt = conn.createStatement();
		while(true) {			
			//1-1]쿼리문 작성
			String sql = "UPDATE MEMBER SET name ='"+getValue("이름")+"',password='"+getValue("비밀번호")+"',WHERE id = '"+getValue("아이디")+"'";
			try {
			//2]쿼리 실행
			System.out.println(stmt.executeUpdate(sql)+"행이 수정되었어요");
			}
			catch(SQLException e) {
				System.out.println("수정시 오류 : "+e.getMessage());
			}
		}
	}//////execute
	public static void main(String[] args) throws Exception {
		new UpdateSQLMore().execute();

	}////////main

}////////class
