package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
	OUT 파라미터값
		-회원인 경우 : 1
		-아이디는 일치하나 비번이 불일치: 0
		-아이디 불일치 : -1
	
	
	CREATE OR REPLACE PROCEDURE SP_ISMEMBER(
	ID_ member.id%TYPE,
	PWD_ member.pwd%TYPE,	
	RTVAL OUT NUMBER
	
	)
	IS
	FLAG NUMBER(1);
	BEGIN
	SELECT COUNT(*) INTO FLAG 
	FROM member
	WHERE id = ID_;
	
	IF FLAG = 0 THEN
		RTVAL  := -1;
	
	ELSE --아이디 일치
		SELECT COUNT(*) INTO FLAG
		FROM MEMBER
		WHERE id = ID_ AND pwd = PWD_;
		IF FLAG=0 THEN--비번 불일치
			RTVAL  :=0;
		ELSE--회원
			RTVAL  :=1;	
		END IF;
	END IF;	
	
	END;
	/

 */
public class IsMemberProc extends IConnectImpl {

	public IsMemberProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}////////////DeleteProc
	@Override
	public void execute() throws Exception {
		//1]프로시저를 실행하기 위한 CallableStatement객체 얻기
		csmt = conn.prepareCall("{call SP_ISMEMBER(?,?,?)}");
		//2]파라미터 설정
		
		csmt.setString(1,getValue("아이디"));
		csmt.setString(2,getValue("비번"));	
		csmt.registerOutParameter(3, Types.NUMERIC);
		//3]프로시저 실행-execute()
		csmt.execute();
		//4]out파라미터에 저장된 값 읽어 오기
		//문자열 출력이 안되는 경우:공백이 많아서 그럼으로 TRIM 하자
		int flag=csmt.getInt(3);
		if(flag == 1) {
			System.out.println("회원님 즐감....");
		}
		else if(flag==0)
			System.out.println("아이디는 일치하나 비번이 불일치");
		else
			System.out.println("아이디 불일치");
		//5]자원반납
		close();
	}///////////execute
	public static void main(String[] args) throws Exception {
		new IsMemberProc().execute();
	}
}
