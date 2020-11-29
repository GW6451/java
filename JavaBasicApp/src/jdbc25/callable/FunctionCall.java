package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;
/*
create or replace FUNCTION TO_ASTERISK(VAL VARCHAR2)
	RETURN VARCHAR2

IS 

BEGIN
	RETURN RPAD(SUBSTR(VAL,1,1),LENGTH(VAL),'*');
END;
 */
public class FunctionCall extends IConnectImpl {
	public FunctionCall() {
		super(ORACLE_URL,"SCOTT","scott");
	}
	@Override
	public void execute() throws Exception {
		csmt = conn.prepareCall("{? = call TO_ASTERISK(?)}");
		//2]인파라미터 설정
		//매개변수는 즉 인파라미터는 setXXX()계열 메소드로 설저
		csmt.setString(2, getValue("문자열"));
		//반환값에 해당하는 파라미터는 아웃 파라미터 방식으로 설정(registerOutParameter).무조건 인덱스가 1
		csmt.registerOutParameter(1,Types.VARCHAR);
		//4]함수 실행-무조건 execute()메소드로 실행
		System.out.println(csmt.execute());
		//5]반환값은 getXXXX()계열로 얻어온다. 단, 인덱스는 무조건 1이다
		System.out.println("함수 실행 반환값 : "+csmt.getString(1));
		//6]자원반납
		close();
	}////////execute
	
	public static void main(String[] args) throws Exception {
		new FunctionCall().execute();
	}////////main

}/////////class
