package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
 create or replace PROCEDURE SP_IS_MEMBER
(
	ID_ MEMBER.ID%TYPE,
	PWD_ MEMBER.PWD%TYPE,
	RTVAL OUT NUMBER
)
IS
	FLAG NUMBER(1);

BEGIN

	SELECT COUNT(*) INTO FLAG 
	FROM MEMBER
	WHERE ID = ID_;

	IF FLAG = 0 THEN
		RTVAL := -1;

	ELSE -- 아이디 일치
		SELECT COUNT(*) INTO FLAG
		FROM MEMBER
		WHERE ID = ID_ AND PWD = PWD_;
		IF FLAG = 0 THEN--비번 불일치
			RTVAL := 0;
		ELSE --회원
			RTVAL := 1;
		END IF;

	END IF;

END;
 */
public class IsMemberProc extends IConnectImpl {
	
	public IsMemberProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}
	@Override
		public void execute() throws Exception {
			//1]프로시저를 실행하기 위한 CallableStatement객체 얻기
			csmt = conn.prepareCall("{call SP_IS_MEMBER(?,?,?)}");
			//2]파라미터 설정
			csmt.setString(1, getValue("아이디"));
			csmt.setString(2, getValue("비밀번호"));
			csmt.registerOutParameter(3, Types.NUMERIC);
			//3]프로시저 실행-execute()
			csmt.execute();
			//4]OUT파라미터에 저장된 값 읽어오기
			//문자열 출력이 안되는 경우
			int flag =  csmt.getInt(3);
			if(flag == 1) {
				System.out.println("회원님 해피데이");
			}
			else if(flag ==0) {
				System.out.println("아이디는 일치하나 비번이 불일치");
			}
			else{
				System.out.println("아이디 불일치");
			}
			//5]자원반납
			close();
		}
	public static void main(String[] args) throws Exception {
		new IsMemberProc().execute();

	}

}
