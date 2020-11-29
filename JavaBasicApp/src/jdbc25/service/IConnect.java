package jdbc25.service;

public interface IConnect {
	//멤버상수]
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	//추상메소드]
	void connect(String url,String user,String password);
	void execute() throws Exception;
	void close();
	String getValue(String message);
	String getQueryString();//오라클 처럼 처리하기 위해
	

}
