//1]패키지 선언문
package package19;
//2]import선언문
/*
 import : 다른 패키지에 있는 클래스들을 가져다 쓸때 사용하는 선언문
 패키지명.하위패키지명...클래스명 식으로
 단, java.lang패키지 안에 있는 클래스들은 기본 패키지로 import할 필요 없다
 패키지명.*;  *은 모든 클래스나 인터페이스를 의미
 */
import java.lang.String;///의미없다
//util패키지 안에 있는 모든 클래스나 인터페이스를 의미
//util패키지 안의 하위 패키지는 포함 안됨
//import java.util.*;
import java.util.Date;
public class PackageApp {

	public static void main(String[] args) {
		//다른 패키지에 있는 클래스 접근 방법
		//방법1]import해서 사용-패키지 지정 불필요
		//util의 Date사용
		Date utilDate = new Date();
		System.out.println(utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlDate);
	}

}
