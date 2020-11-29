package controlstatement03;

import java.io.IOException;

public class IfStatement03 {
	
	public static void main (String [] a) throws IOException {
	/*
	 if 기본형식3]
	 if(조건식1){
	 	조건식1이 참일때 실행할 명령문1
	 	}
	else if(조건식2){
		조건식2가 참일때 실행할 명령문2
		}
	else if(조건식3){
		조건식3이 참일떄 실행할 명령문3
		}
	else if(조건식4){
		조건식3이 참일떄 실행할 명령문4
		}
	else if(조건식n){
		조건식n이 참일떄 실행할 명령문n
		}
		[
			else{
				모든 조건식이 거짓일때 실행할 명령문else
				}
				]
	 */
	 int kor=99, eng=80, math=89;
	 double avg =(kor+eng+math)/3.0;
	 if(avg >=90) System.out.println("A학점");
	 else if(avg >=80) System.out.println("B학점");
	 else if(avg >=70) System.out.println("C학점");
	 else if(avg >=60) System.out.println("D학점");
	 else System.out.println("F학점");
	 System.out.println("한 문자를 입력하세요?");
	 char word =(char)System.in.read();
	 /*문]숫자인지 판단 후 2의 배수를 판단하고 2의 배수이면 "2의 배수" 출력 아니면 "2의배수가 아님" 출력
			 또한 숫자가 아니고 알파벳이라면 대소문자를 판단 후 대문자인 경우 "대문자" 출력, 소문자인경우 "소문자" 출력
	  */
	 
	 if(word >= '0' && word <= '9' && (word-'0')%2==0) System.out.println("2의 배수");
	 else if(word >= '0' && word <= '9' && (word-'0')%2 != 0) System.out.println("2의배수가 아님");
	 else if(word >= 'A' && word <= 'Z') System.out.println("대문자");
	 else if(word >= 'a' && word <= 'z') System.out.println("소문자");
	 
	 /*문] 사용자로부터 한 문자를 입력받아 숫자이면 "숫자"
	  	    알파벳이면 "알파벳" 숫자도 알파벳도 아니면 "기타"를 출력하라
	  	 if ~else if ~else 사용
	  */
	 if(word >= '0' && word <= '9') System.out.println("숫자");
	 else if(word >= 'A' && word <= 'Z' || word >= 'a' && word <= 'z') System.out.println("알파벳");
	 else System.out.println("기타");
	 
	 //문](종합) 세숫자 중 최대값 구하는 로직을 작성하자(if문 형식 3가지 중 아무거나 사용가능)
	 int num1 = 900, num2 = 10, num3 = 2;
	 if(num1 > num2 && num1 > num3) System.out.println("최대값:"+"num3");
	 else if(num2 > num1 && num2 > num3) System.out.println("최대값:"+"num2");
	 else if(num3 > num1 && num3 > num2) System.out.println("최대값:" +"num1");
	 
	 /*int num1 = 900, num2 = 10, num3 = 2;
	   int max = num1;
	   if(max < num2) max = num2;
	   if(max < num2) max = num3;
	   System.out.println("최대값:" + max);
	   */
	 
			 
	}
}
