package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
 create or replace PROCEDURE SP_INS_MEMBER
( 
	ID_ IN MEMBER.ID%TYPE,
	PWD_ MEMBER.PWD%TYPE,
	NAME_ MEMBER.NAME%TYPE,
	RTVAL OUT NVARCHAR2
)
IS
	--변수선언(변수 필요 없으면 생략가능)

BEGIN
	INSERT INTO MEMBER(ID, PWD, NAME)
	VALUES(ID_,PWD_,NAME_);
	IF SQL%FOUND THEN

		RTVAL := '입력 성공';
		COMMIT;
	END IF;

	EXCEPTION 
		WHEN OTHERS THEN
			 ROLLBACK;
			 RTVAL := '입력 실패-중복키나 입력값이 크다';

END;
 */
public class InsertProc extends IConnectImpl {
	public InsertProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}
	@Override
	public void execute() throws Exception {
		//1]프로시저를 실행하기 위한 CallableStatement객체 얻기
		/*
		 * Connection객체의 PrepareCall("{call 프로시저명(?,?,....}")
		 * 메소드 호출
		 */
		csmt = conn.prepareCall("{call SP_INS_MEMBER(?,?,?,?)}");
		//2]파라미터 설정
		//2-1]인파라미터(?) 설정
		csmt.setString(1, getValue("아이디"));
		csmt.setString(2, getValue("비밀번호"));
		csmt.setString(3, getValue("이름"));
		//2-2]오라클의 OUT파라미터에 해당하는 ? 설정 - registerOutParameter()
		csmt.registerOutParameter(4, Types.NVARCHAR);
		//3]프로시저 실행 - execute()
		System.out.println(csmt.execute());
		//4]out파라미터에 저장된 값 읽어오기 - getXXX()메소드
		System.out.println("프로시저의 아웃 파라미터 값 : "+csmt.getString(4));
		//5]자원반납
		close();
	}
	public static void main(String[] args) throws Exception {
		new InsertProc().execute();
	}////////main

}////////////class
