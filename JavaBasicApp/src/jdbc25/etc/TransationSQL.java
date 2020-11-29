package jdbc25.etc;

import jdbc25.service.IConnectImpl;

public class TransationSQL extends IConnectImpl {
	public TransationSQL() {
		super(ORACLE_URL,"JDBC","JDBC");
	}
	@Override
	public void execute() throws Exception {
		try {
			//<첫번째 작업 - 삭제>
			//1]자동 커밋이 일어나지 않도록 설정
			conn.setAutoCommit(false);
			String sql = "DELETE member WHERE id=?";
			
			//3-1]PreparedStatement객체 생성
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getValue("삭제할 아이디"));
			
			//3-2]첫번째 쿼리문 실행
			System.out.println(psmt.executeUpdate()+"행이 삭제 되었어요");
			
			//<두번째 작업>
			//4]두번째 쿼리문 작성 - 중복된 아이디 입력
			sql="INSERT INTO member VALUES(?,?,?,SYSDATE)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getValue("아이디"));
			psmt.setString(2, getValue("비밀번호"));
			psmt.setString(3, getValue("이름"));
			//4-2]두번째 쿼리문 실행
			System.out.println(psmt.executeUpdate()+"행이 입력 되었어요");
			//커밋]
			conn.commit();
			System.out.println("커밋되었어요");
		}
		catch(Exception e) {
			//롤백]
			conn.rollback();
			System.out.println("롤백되었어요");
		}
		finally {
			close();
		}
	}////execute
	public static void main(String[] args) throws Exception {
		new TransationSQL().execute();
	}//////////main

}/////////class
