package controlstatement03;

import java.io.IOException;

public class IfStatement01 {

	public static void main(String[] args) throws IOException {
		//분기문(조건문):프로그램 흐름상 분기하고자 할때 사용하는 제어문
		//if문/switch문 두가지가 있다
		//if문 기본형식1]
		/*
		 조건식은 비교식 내지 논리식이어야한다.
		 즉 결과값이 true 아니면 false가 나오는 식이거나 직접 boolean값(true,false)을 줄 수 있다
		 
		 if(조건식){//만약(if) 조건식이 참이라면 조건식이 참일때 실행할 명령문;
		 
		 }
		 
		 조건식이 참일때 실행할 명령문이 하나이면 {}생략가능하다
		 {}는 실행문들을 하나로 묶는 블락역할을 한다
		 */
		
		int num1 =10;
		//1]결과값이 boolean값이 아닌 식은 조건식으로 불가
		//if(num1 % 2) {}//[x]
		//if(num1) {}//[x]
		//2]조건식은 비교식 아니면 논리식 혹은 boolean 값(true,false)
		if(num1 % 2 == 0) {
			System.out.printf("%d는 짝수%n",num1);
		}
		if(num1 % 2 !=0) {
			System.out.printf("%d는 홀수%n",num1);
		}
		if(num1 % 2 ==0 && num1 >= 10) {
			System.out.printf("%d는 짝수이고 10보다 크거나 같은 수이다",num1);
		}
		if(true) {
			System.out.println("항상 실행되는 명령문");
		}
		if(true) {
			System.out.println("항상 실행되는 명령문");
			
		}
		if(false) {
			System.out.println("절대 실행되지 않는 명령문");
		}
		//2]if(조건식) ;는 조건식이 참일때 수행할 명령문이 없음을 의미(조심)
		if(num1 % 2 != 0);{
			System.out.printf("%d는 홀수%n",num1);
		}
		//3]조건식이 참일때 수행할 명령문이 하나인 경우 {}생략 가능
		if(num1 % 2 == 0)
			System.out.printf("%d는 짝수%n",num1);
		/*3-1]수행할 명령문이 여러개인 경우{}을 생략하면 의도하지 않은 결과를 초래할 수 있다
		 고로 조건식이 참일때 수행할 명령문이 여러개인 경우는 반드시 {}로 묶어라 */
		if(num1 % 2 != 0) {
			System.out.printf("num1는 %d다%n",num1);
			System.out.printf("%d는 홀수%n",num1);
		}
		//System.in.read()메소드 : 사용자 입력을 받을때까지 블락상태가 된다
		//						 즉 다음코드가 실행이 안된다
		//						 입력한 문자의 아스키 코드값
		System.out.println("한 문자를 입력하세요?");
		int asciiCode = System.in.read();
		//System.out.println("사용자가 입력한 아스키 코드값 :" +asciiCode);
		//System.out.println("사용자가 입력한 문자:" +(char)asciiCode);
		//사용자가 입력한 문자가 숫자인지 아닌지를 판단하자
		//1]아스키 코드값을 알 때
		/*
		boolean isNumber = asciiCode >= 48 && asciiCode <= 57;
		if(isNumber) System.out.println("입력한 문자는 숫자다");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아니다");
		*/
		//2]아스키 코드값을 모를때
		//boolean isNumber = asciiCode >= '0' && asciiCode <= '9';
		//if(isNumber) System.out.println("입력한 문자는 숫자다");
		//if(!isNumber) System.out.println("입력한 문자는 숫자가 아니다");
		/*문제]사용자가 입력한 문자가 알파벳이거나 숫자이면 "알파벳 혹은 숫자"라고 출력하고 아니면 "기타"라고  출력하여라
		 		(아스키 코드값 모른다고 가정) else 문  불가
		 		참고로 영문 알파벳의 아스키 코드값은 대문 A(65)~Z(90), 소문자 a (97) ~ z(122)*/
		boolean isAlphabet = asciiCode >= 'A' && asciiCode <= 'Z' || 
				             asciiCode >= 'a' && asciiCode <= 'z' ||  
				             asciiCode >= '0' && asciiCode <= '9';
		if(isAlphabet) System.out.println("입력한 문자는 알파벳이거나 숫자다");
		if(!isAlphabet) System.out.println("입력한 문자는 기타이다");
		System.out.println("한 문자를 다시 입력하세요?");
		/*		
		char word = (char)System.in.read();//r
		System.out.println("입력한 문자:"+(int)word);
		word = (char)System.in.read();//n
		System.out.println("입력한 문자:"+(int)word);
		word = (char)System.in.read();*/
		//엔터값 읽어서 미사용
		//System.in.read();
		//System.in.read();
		System.in.skip(2); // System.in.read(); 를 두 번 쓴거와 같다
		char word = (char)System.in.read(); //'0'=48 이라고 지정한것은 사람이 정한것이기 때문에 대입에 따라 '0'의 숫자는 달라짐
		//System.out.println("입력한 문자 : "+word);
		/*
		문제] 사용자가 입력한 값이 숫자인지 먼저 판단하고 숫자라면 2의 배수인지 판단하여 2의 배수인 경우만 "2의배수 입니다" 라고 출력하여라
		     2의 배수가 아닌 경우 "2의 배수가 아니다"라고 출력
		     문자 '0'의 아스키코드값 : 48
		 */
		//방법1] 하나의 조건식안에서 논리 연산으로 처리
		/*boolean isTwonumber = word >= '0' && word <= '9';
		  if(isTwonumber&&(word-'0')%2 ==0 ) System.out.println("2의배수 입니다"); 
		  if(isTwonumber&&(word-'0')%2 !=0 ) System.out.println("2의배수가 아닙니다");
		*/
		/*방법2]
		 boolean isTwonumber = word >= '0' && word <= '9';
		 if(isTwonumber) isTwonumber = word'0' == 0;
		 if(isTwonumber) System.out.println("2의배수 입니다");
		 if(!isTwonumber) System.out.println("2의배수 입니다");
		 
		 */
		boolean isTwonumber = word >= '0' && word <= '9';
		boolean isTwonumber2 = (word-'0')%2 ==0;
		if(isTwonumber&&isTwonumber2) 
			System.out.println("2의배수 입니다");
		if(!(isTwonumber&&isTwonumber2))
			System.out.println("2의배수가 아니다");
		
		

		}
		
				
	}


