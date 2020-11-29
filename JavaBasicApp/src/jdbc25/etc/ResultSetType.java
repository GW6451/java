package jdbc25.etc;

import java.sql.ResultSet;

import jdbc25.service.IConnectImpl;

public class ResultSetType extends IConnectImpl {
	
	public ResultSetType() {
		super(ORACLE_URL,"scott","scott");
	}
	@Override
	public void execute() throws Exception {
		//1]쿼리문 미리준비
		String sql = "SELECT * FROM emp ORDER BY sal DESC";
		//2]쿼리 실행용 객체(Statement계열 - PreparedStatement) 생성
		//2-1]아래는 커서를 레코드 하나씩 전진(foward)만 가능 - next()만 호출 가능
		//psmt = conn.prepareStatement(sql);
		//2-2]커서를 전/후진이 가능하도록 설정
		psmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		//3]쿼리 실행
		rs = psmt.executeQuery();
		//커서를 마지막 레코드로 이동
		System.out.println("커서를 마지막 레코드로 이동:"+rs.last());
		System.out.println("총 레코드 수:"+rs.getRow());
		//커서를 다시 첫번째 레코드 바로 전으로 이동]
		rs.beforeFirst();
		System.out.println("[연봉이 높은 순]");
		while(rs.next()) {
			System.out.println(
					String.format("%-10s%-7s%-10s%-6s%s",
							rs.getString(1),//empno
							rs.getString(2),//ename
							rs.getString(3),//job
							rs.getString(6),//sal
							rs.getDate(5)//hiredate
							));
		}
		System.out.println("[연봉이 낮은 순]");
		while(rs.previous()) {
			System.out.println(
					String.format("%-10s%-7s%-10s%-6s%s",
							rs.getString(1),//empno
							rs.getString(2),//ename
							rs.getString(3),//job
							rs.getString(6),//sal
							rs.getDate(5)//hiredate
							));
		}
		//4]자원 반납
		close();
	}
	public static void main(String[] args) throws Exception {
		new ResultSetType().execute();
	}

}
