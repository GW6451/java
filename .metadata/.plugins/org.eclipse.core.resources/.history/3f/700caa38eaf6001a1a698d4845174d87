package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class practiceStatement01 {

	public static void main(String[] args) throws IOException {
		/*문제1]사용자가 입력한 문자가 알파벳이거나 숫자이면 "알파벳 혹은 숫자"라고 출력하고 아니면 "기타"라고  출력하여라
 		(아스키 코드값 모른다고 가정) else 문  불가
 		참고로 영문 알파벳의 아스키 코드값은 대문 A(65)~Z(90), 소문자 a (97) ~ z(122)*/
		System.out.println("한 문자를 입력하세요?");
		int asciiCode = System.in.read();
		boolean isNumber = asciiCode >= '0' && asciiCode <= '9' ||
						   asciiCode >= 'A' && asciiCode <= 'Z' ||
						   asciiCode >= 'a' && asciiCode <= 'a';
				if(isNumber)   System.out.println("입력한 문자는 숫자 또는 알파벳이다");
				if(!isNumber)  System.out.println("입력한 문자는 기타이다");
		/*문제] 사용자가 입력한 값이 숫자인지 먼저 판단하고 숫자라면 2의 배수인지 판단하여 2의 배수인 경우만 "2의배수 입니다" 라고 출력하여라
		     2의 배수가 아닌 경우 "2의 배수가 아니다"라고 출력
		          문자 '0'의 아스키코드값 : 48*/
		System.out.println("한 문자를 다시 입력하세요?");
		System.in.skip(2);
		char word = (char)System.in.read();
		boolean isMultiple = word >= '0' && word <= '9';
		boolean isMultiple_1 = (word-'0')%2 == 0;
		if(isMultiple && isMultiple_1) System.out.println("2의 배수입니다");
		if(!(isMultiple && isMultiple_1)) System.out.println("2의 배수가 아닙니다");
		
		
		/*
		&&& 문]숫자인지 판단 후 2의 배수를 판단하고 2의 배수이면 "2의 배수" 출력 아니면 "2의배수가 아님" 출력
		 또한 숫자가 아니고 알파벳이라면 대소문자를 판단 후 대문자인 경우 "대문자" 출력, 소문자인경우 "소문자" 출력
		 가정] 숫자나 알파벳만 입력한다고 가정 */
		System.in.skip(2);
		System.out.println("한 문자를 다시 입력?");
		
		boolean isNumber1 = word >= '0' && word <='9' && word % 2 == 0;
		boolean isUpper = word >= 'A' && word <= 'Z';
		boolean isMultiple1 = (word-'0')%2 == 0;
		if(isNumber1) {
			if(isMultiple1) System.out.println("2의배수");
			else System.out.println("2의배수가 아님");
		}
		else {
			if(isUpper) System.out.println("대문자");
			else System.out.println("소문자");
		}
		System.out.println(isNumber1? isMultiple1? "2의 배수": "2의 배수가 아님" : isUpper? "대문자":"소문자");
		
		 /*문]숫자인지 판단 후 2의 배수를 판단하고 2의 배수이면 "2의 배수" 출력 아니면 "2의배수가 아님" 출력
		 또한 숫자가 아니고 알파벳이라면 대소문자를 판단 후 대문자인 경우 "대문자" 출력, 소문자인경우 "소문자" 출력
		  */
		if(word >= '0' && word <= '9' && word % 2 == 0) System.out.println("2의 배수");
		else if(word >= '0' && word <= '9' && word % 2 != 0) System.out.println("2의배수가 아님");
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
		int num1 = 15, num2 = 14, num3 = 13;
		if(num1>num2 && num1>num3) System.out.println("최대값:"+"num1");
		else if(num2>num1 && num2>num3) System.out.println("최대값:"+"num2");
		else if(num3>num1 && num3>num2) System.out.println("최대값:"+"num3");
		
		/*문]평균을 구해서 90점이상 "A학점" 출력
		  80점이상 "B학점" 출력
		  70점이상 "C학점" 출력
		  60점이상 "D학점" 출력
		  60점미만 "F학점" 출력
		  단, switch문 사용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력?");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력?");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력?");
		int math = sc.nextInt(); 
		int avg = (kor + eng + math)/30;
		switch(avg) {
			case 10 : 
				System.out.println("A학점");break;
			case 9 : 
				System.out.println("B학점");break;
			case 8 : 
				System.out.println("C학점");break;
			case 7 : 
				System.out.println("D학점");break;
			default : 
				System.out.println("F학점");
		}
		
		/*문제 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수인 경우, 누적합에 단 한번만 포함시켜라*/
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			if(i % 3 == 0 || i % 5 ==0) sum += i;
		}
		System.out.println("1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합:"+sum);
	
		/*문제 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수는 제외시켜라*/
		sum = 0;
		for(int i = 1;i<=100;i++) {
			if((i % 3 == 0 || i % 5 ==0) && i % 15 != 0) sum += i;
		}
		System.out.println("1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합(최송공배수의 배수 제외):"+sum);
		
		/*
		 * 1000
		 * 0100
		 * 0010
		 * 0001
		 * 0000
		 */
		for (int k=1; k<=5; k++) {
			for(int j=1; j<=4; j++) {
				if(k==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}

		/*
		 * 0001 
		 * 0010
		 * 0100
		 * 1000
		 */
		for (int k=1; k<=4; k++) {
			for(int j=1; j<=4; j++) {
				if(k+j==5) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}

		/*
		
		 *         1,1
		 * *       2,1 2,2
		 * * *     3,1 3,2 3,3
		 * * * *   4,1 4,2 4,3 4,4
		 * * * * * 5,1 5,2 5,3 5,4 5,5
		 
		 */
		for(int k=1; k<=5; k++) {
			for(int j=1; j<=5; j++) {
				if(k>=j) System.out.printf("%-2c",'*');
			}
			System.out.println();
		}
		
		/*문제]**
		아래 형식대로 구구단을 출력하라*/
		for(int k=1; k<=9; k++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%-3d %-3c %-3d %-3c %-6d",j,'*',k,'=',j*k);
			}
			System.out.println();
		}
		
	}////main

}////class
