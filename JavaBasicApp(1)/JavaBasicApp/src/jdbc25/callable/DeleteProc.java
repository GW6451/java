package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
	CREATE OR REPLACE PROCEDURE SP_DEL_MEMBER(
		ID_ member.id%TYPE,
		APPECTED OUT NUMBER
	
	)
	IS
	BEGIN
		DELETE member
		WHERE id = ID_;
	
		IF SQL%FOUND THEN
			DBMS_OUTPUT.PUT_LINE(ID_ || '가 삭제되었어요');
			APPECTED := SQL%ROWCOUNT;
			COMMIT;
		ELSE
			DBMS_OUTPUT.PUT_LINE(ID_ || '가 존재하지 않아요');
			APPECTED := -1;
		END IF;
	
		EXCEPTION
		WHEN OTHERS THEN
			ROLLBACK;
			DBMS_OUTPUT.PUT_LINE('자식이 참조하고 있어요');
			APPECTED := -2;
	
	
	
	END;
	/
 */
public class DeleteProc extends IConnectImpl {

	public DeleteProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}////////////DeleteProc
	@Override
	public void execute() throws Exception {
		//1]프로시저를 실행하기 위한 CallableStatement객체 얻기
		csmt = conn.prepareCall("{call SP_DEL_MEMBER(?,?)}");
		//2]파라미터 설정
		String id = getValue("삭제할 아이디");
		csmt.setString(1,id);
		csmt.registerOutParameter(2, Types.NUMERIC);
		//3]프로시저 실행-execute()
		csmt.execute();
		//4]out파라미터에 저장된 값 읽어 오기
		int rtnum=csmt.getInt(2);
		switch(rtnum) {
			case 1:System.out.println(id+"가 삭제 되었습니다");break;
			case -1:System.out.println(id+"는(은) 존재하지 않은 아이디 입니다");break;
			default:System.out.println("자식이 참조하고 있어요");
		}
		//5]자원반납
		close();
	}///////////execute
	public static void main(String[] args) throws Exception {
		new DeleteProc().execute();
	}

}
