package exception21;

import java.io.IOException;

/*
예외객체 생성후  throw키워드를 이용해서 직접 던지기
- 반환타입 메소드명 throws 예외클래스와 쌍이다.

- throws를 이용해서 던진 예외는 언젠가는 반드시 
try~catch를
해야 한다. 즉 만약 계속 던졌다면
최종 main에서는 다시 던질 수는 있지만 
실행시 에러 고로 
try~catch해야 한다.	

	형식]
	접근지정자 [modifier] 반환타입 메소드명 throws 예외클래스{
		특정조건일때
		throw new Exception();
		
		//throw 이후의 명령문은 실행이 안된다.
	}
*/
public class ExceptionThrowsApp {
	/*
	 * 기존 자바에서 제공해주는 예외를 던지는 메소드(예: read()) 호출 하는경우
	 */
	static void throwsMethodByJava() throws IOException{
		System.out.println("문자 입력");
		System.in.read();
	}
	static void callByJava() throws IOException{
		throwsMethodByJava();
	}
	static void throwsMethodByUser(int value) throws Exception {
		if(value % 2 ==0) {
			//1. 예외객체 생성
			Exception e = new Exception("짝수 안돼요");
			//2. 생성된예외 객체 던지기(throws키워드 사용)
			throw e;
			//System.out.println("throw 키워드 사용");//[x] unreachable
		}
		System.out.println(value+"는(은) 홀수");
	}
	static void callByUser(int value) throws Exception {
		throwsMethodByUser(value);
	}
	public static void main(String[] args) /*throws Exception(콜바이유저호출시)*/ /*throws IOException(콜바이호출시)*/{
		//callByJava();//[o] 또 던진다
		//직접 처리
		/*
		try {
			callByJava();
		}
		catch(IOException e) { e.printStackTrace();}
		*/
		// 내가 직접 던진 예외는 계속 던져도 되나 반드시 메인메소드에서는 try~catch로 처리해야한다(던져도 실행시 오류)
		 
		//callByUser(10);//[x] 실행시오류
		
		try {
			callByUser(9);
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}

	}///////main

}/////////class
