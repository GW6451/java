package exception21;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasicApp {
	//멤버변수]
	static Date today;
	public static void main(String[] args) {
		/*
		 1] 컴파일 에러(Checked Exception):
		  			- 컴파일시 발생하는 에러
		  			- Syntax erorr(문법 오류), IOException(예외클래스),SQLException(예외클래스) 등
		  			- 컴파일이 안되면 실행이 안됨
		  			- 컴파일 에러(외부자원 사용시 발생하는 컴파일 에러 : IOException,SQLException)는 던지거나
		  			     직접 처리(try~catch절)할 수 있다
		  			     단 Syntax error(문법오류)는 직접 수정해야함 
		 */
		//1-1]Syntax(문법오류)
		//Int num;[x]
		int num;//[o]
		if(true); {}
		//else {}[x]else는 항상 if와 짝을 이루어야 한다
		//1-2]외부 자원 사용시 발생하는 예외
		//		해결책 : 예외를 던지거나(throw절)나 직접 처리(try~catch절 사용)
		//방법1]예외던지기
		//	호출한 메소드() throws 예외클래스{}
		//System.in.read();
		//방법2]try~catch절
		/*
		try {
			System.in.read();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}*/
		
		/*
		 2]런타임에러(Unchecked Exception)
		 - 컴파일시에는 체크가 안됨 실행시에만 발생되는 에러
		 - Runtime Exception계열(NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException등)
		 - main메소드에서는 throw해도 오류발생
		 	즉 직접처리(try~catch절 사용)해야만 한다
		 	
		 #예외 발생시 JVM은 해당 예외클래스를 인스턴스화 해서 예외객체를 프로그램 쪽에 전달한다
		 */
		
		//[ArrayIndexOutOfBoundsException]:
		// 배열의 크기를 벗어난 인덱스 사용시
		try {
		int[] array = new int[2];
		array[0] = 100;
		System.out.println("array[0] :"+array[0]);
		array[1] = 200;
		System.out.println("array[1] :"+array[1]);
		array[2] = 300;
		//런타입 예외가 발생한 지점부터 그 이후의 코드는 실행이 안됨. 바로 catch절로 빠진다
		System.out.println("array[2] :"+array[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			System.out.println("관리자에게 문의");
		}
		//[NumberFormatException]: 숫자형식의 문자열을 int형으로 변환시 해당 문자열이 숫자형식이 아닐때
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		try {
			/*
			String stringAge = sc.nextLine();
			int age = Integer.parseInt(stringAge);*/
			int age = sc.nextInt();
			System.out.println("당신의 10년 후 나이 : "+(age + 10));
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("나이는 숫자만");
		}
		/*
		 [NullPointerException] :
		 인스턴스 변수에 해당 객체의 메모리 주소가 저장이 안된 경우에 .으로 객체의 멤버에 접근할때 발생
		 */
		System.out.println("today : " +today);
		try {
		System.out.println(today.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("today는 널입니다. 포인터 할 수 없어요");
		}
		/*
		 * "" : 빈 문자열, null 아님
		 * null : null값. null이다
		 */
		String emptyString = "";
		System.out.println("emptyString의 문자열 길이 : "+emptyString.length());
		String nullString = null;
		try {
		System.out.println("nullString의 문자열 길이 : "+nullString.length());
		}
		catch(NullPointerException e) {
			System.out.println("nullString은 널입니다. 포인터 할 수 없어요");
		}
		/*
		 * [ArithmeticException] : 0으로 나눌 때 발생
		 */
		int result = 0;
		try {
			result /= 0;//result = result / 0;
			System.out.println("0으로 나눈 결과 : " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		}
		/* 
		 * ClassCastException 
		 */
		Object obj = new Object();
		try {
			String str = (String)obj;
		}
		catch(ClassCastException e) {
			//예외 메시지 출력방법]
			//1.사용자 임의 예외 메시지
			//System.out.println("형변환 할 수 없어요");
			//2.예외 클래스의 인스턴스 변수 이용 : e.toString()
			// "예외 클래스 : 예외 메시지" 형태를 문자열로 반환
			//System.out.println(e.toString());
			//3.e.getMssage(e.toString())
			//java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
			//System.out.println(e.getMessage());
			//4.e.getMssage(e.getMessage())
			e.printStackTrace();
		}
	}//////main

}/////////class
