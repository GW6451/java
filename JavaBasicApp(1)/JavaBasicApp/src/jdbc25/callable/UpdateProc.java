package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
	CREATE OR REPLACE PROCEDURE SP_UP_MEMBER(
		ID_ member.id%TYPE,
		PWD_ member.pwd%TYPE,
		NAME_ member.name%TYPE,
		RTVAL OUT CHAR
	
	)
	IS
	BEGIN
		UPDATE member SET pwd = PWD_ , name = NAME_
		WHERE id = ID_;
	
		IF SQL%FOUND THEN
			RTVAL := 'SUCCESS';
			COMMIT;
		ELSE
	
			RTVAL := 'FAIL : NOT FOUND ID';
		END IF;
	
		EXCEPTION
		WHEN OTHERS THEN
		BEGIN
			ROLLBACK;
			RTVAL := 'FAIL : TOO MUCH VALUE';
	
	
		END;
	
	END;
	/
 */
public class UpdateProc extends IConnectImpl {

	public UpdateProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}////////////DeleteProc
	@Override
	public void execute() throws Exception {
		//1]프로시저를 실행하기 위한 CallableStatement객체 얻기
		csmt = conn.prepareCall("{call SP_UP_MEMBER(?,?,?,?)}");
		//2]파라미터 설정
		
		csmt.setString(1,getValue("수정할 아이디"));
		csmt.setString(2,getValue("비번"));
		csmt.setString(3,getValue("이름"));
		csmt.registerOutParameter(4, Types.CHAR);
		//3]프로시저 실행-execute()
		csmt.execute();
		//4]out파라미터에 저장된 값 읽어 오기
		//문자열 출력이 안되는 경우:공백이 많아서 그럼으로 TRIM 하자
		System.out.println(csmt.getString(4).trim());
		//5]자원반납
		close();
	}///////////execute
	public static void main(String[] args) throws Exception {
		new UpdateProc().execute();
	}
}
