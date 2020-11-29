package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class practiceStatement03 {

	public static void main(String[] args) throws IOException {
		/*문제1]사용자가 입력한 문자가 알파벳이거나 숫자이면 "알파벳 혹은 숫자"라고 출력하고 아니면 "기타"라고  출력하여라
 		(아스키 코드값 모른다고 가정) else 문  불가
 		참고로 영문 알파벳의 아스키 코드값은 대문 A(65)~Z(90), 소문자 a (97) ~ z(122) */
		System.out.println("[문제1]");
		int num1 = System.in.read();
		if(num1>='0' && num1<='9' || num1>='A' && num1<='Z' || num1>='a' && num1<='z')
			System.out.println("알파벳 혹은 숫자");
		else System.out.println("기타");
		
		/*문제2] 사용자가 입력한 값이 숫자인지 먼저 판단하고 숫자라면 2의 배수인지 판단하여 2의 배수인 경우만 "2의배수 입니다" 라고 출력하여라
	     2의 배수가 아닌 경우 "2의 배수가 아니다"라고 출력 (if ~ else 사용)
	          문자 '0'의 아스키코드값 : 48 */
		System.in.skip(2);
		System.out.println("[문제2]");
		int num2 = System.in.read();
		if(num2>='0' && num2<='9' && num2%2==0) System.out.println("2의 배수");
		else System.out.println("2의 배수가 아니다");
		
		/*문제3]숫자인지 판단 후 2의 배수를 판단하고 2의 배수이면 "2의 배수" 출력 아니면 "2의배수가 아님" 출력
		 또한 숫자가 아니고 알파벳이라면 대소문자를 판단 후 대문자인 경우 "대문자" 출력, 소문자인경우 "소문자" 출력
		 가정] 숫자나 알파벳만 입력한다고 가정 
		 (if ~ else 사용)*/
		System.in.skip(2);
		System.out.println("[문제3]");
		int num3 = System.in.read();
		boolean isnum3 = num3>='0' && num3<='9';
		boolean ismul3 = num3 % 2== 0;
		boolean isUpper3 = num3>='A' && num3<='Z';
		if(isnum3) {
			if(ismul3)System.out.println("2의 배수");
			else System.out.println("2의 배수가 아니다");
		}
		if(!isnum3) {
			if(isUpper3) System.out.println("대문자");
			else System.out.println("소문자");
		}		
		//[삼항 연산자로 다시 풀어보기]
		System.in.skip(2);
		System.out.println("[삼항 연산자]");
		System.out.println(isnum3?ismul3? "2의 배수":"2의 배수가 아니다":isUpper3?"대문자":"소문자");
		/*
		 문제4]숫자인지 판단 후 2의 배수를 판단하고 2의 배수이면 "2의 배수" 출력 아니면 "2의배수가 아님" 출력
		 또한 숫자가 아니고 알파벳이라면 대소문자를 판단 후 대문자인 경우 "대문자" 출력, 소문자인경우 "소문자" 출력  
		 (if ~ else if 사용)*/
		System.in.skip(2);
		System.out.println("[문제4]");
		int num4 = System.in.read();
		if(num4>='0' && num4<='9' && num4 % 2 ==0) System.out.println("2의 배수");
		else if(num4>='0' && num4<='9' && num4 % 2 !=0) System.out.println("2의 배수가 아니다");
		else if(num4>='A' && num4<='Z') System.out.println("대문자");
		else if(num4>='a' && num4<='z') System.out.println("소문자");
		/*
		 문제5]사용자로부터 한 문자를 입력받아 숫자이면 "숫자" 알파벳이면 "알파벳" 숫자도 알파벳도 아니면 "기타"를 출력하라
	 	  (if ~else if ~else 사용) */
		System.in.skip(2);
		System.out.println("[문제5]");		
		int num5 = System.in.read();
		if(num5>='0' && num5<='9') System.out.println("숫자");
		else if(num5>='A' && num5<='Z' || num5>='a' && num5<='z') System.out.println("알파벳");
		else System.out.println("기타");
		/*
		  문제6]평균을 구해서 90점이상 "A학점" 출력
		 				80점이상 "B학점" 출력
		 				70점이상 "C학점" 출력
		 				60점이상 "D학점" 출력
		 				60점미만 "F학점" 출력
		  				단, switch문 사용  */
		System.in.skip(2);
		System.out.println("[문제6]");		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수");
		int kor6 = sc.nextInt();
		System.out.println("영어점수");
		int eng6 = sc.nextInt();
		System.out.println("수학점수");
		int math6 = sc.nextInt();
		int avg6 = (kor6+eng6+math6)/30;
		switch(avg6) {
			case 10 : 
				System.out.println("A학점");
			case 9 :
				System.out.println("A학점"); break;
			case 8 :
				System.out.println("B학점"); break;
			case 7 :
				System.out.println("C학점"); break;
			case 6 :
				System.out.println("D학점"); break;
			default :
				System.out.println("F학점");
		}
		
		/*
		 문제7]
		 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수인 경우, 누적합에 단 한번만 포함시켜라(For문 사용)*/
		System.in.skip(2);
		System.out.println("[문제7]");
		int sum7 = 0;
		for(int i7=1;i7<=100;i7++) {
			if(i7%3==0 || i7%5==0) sum7 += i7;
		}
		System.out.println("1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합: "+sum7);
		
		/*
		 문제8]
		 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수는 제외시켜라(for문 사용)*/
		System.in.skip(2);
		System.out.println("[문제8]");
		int sum8 = 0;
		for(int i8=1; i8<=100; i8++) {
			if((i8%3==0 || i8%5==0) && i8%15!=0) sum8 += i8;
		}
		System.out.println("1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합(공배수는 제외) : " + sum8);
		
		/*
		 문제9]
		 * 1000
		 * 0100
		 * 0010   형태로 만들어라(이중 for문)
		 * 0001
		 * 0000
		 */
		
		System.in.skip(2);
		System.out.println("[문제9]");
		for(int i9=1; i9<=5; i9++) {
			for(int j9=1; j9<=4; j9++) {
				if(i9==j9) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		
		/*
		 문제10]
		 * 0001 
		 * 0010   형태로 만들어라(이중 for문)
		 * 0100
		 * 1000
		 */
		
		System.in.skip(2);
		System.out.println("[문제10]");
		for(int i0=1; i0<=4; i0++) {
			for(int j0=1; j0<=4; j0++) {
				if(i0+j0 ==5) System.out.printf("%-2d", 1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		
		
		/*
		 문제11]
		 *         1,1
		 * *       2,1 2,2
		 * * *     3,1 3,2 3,3
		 * * * *   4,1 4,2 4,3 4,4
		 * * * * * 5,1 5,2 5,3 5,4 5,5
		 */
		System.in.skip(2);
		System.out.println("[문제11]");
		for(int i1=1; i1<=5; i1++) {
			for(int j1=1; j1<=5; j1++) {
				if(i1>=j1) System.out.printf("%-2c", '*');
			}
			System.out.println();
		}
		
		/*
		 문제12] 구구단을 출력하라*/
		
		System.in.skip(2);
		System.out.println("[문제12]");
		for(int i2=1;i2<=9;i2++) {
			for(int j2=2;j2<=9;j2++)
				System.out.printf("%-3d%-3c%-3d%-3c%-5d",j2,'*',i2,'=',i2*j2);
			System.out.println();
		}

		/*
		 과제]
		 * * * * *  5,1 5,2 5,3 5,4 5,5
		 * * * * 	4,1 4,2 4,3 4,4
		 * * * 		3,1 3,2 3,3
		 * * 		2,1 2,2
		 *          1,1
		           
		 */
		System.in.skip(2);
		System.out.println("[과제]");
		System.out.println("<for>");
		for(int i3=5; i3>=1; i3--) {
			for(int j3=1; j3<=5; j3++) {
				if(i3>=j3) System.out.printf("%-2c",'*');
			}
			System.out.println();
		}
		System.out.println("<while>");
		int i3_1 = 5;
		while(i3_1>=1) {
			int j3_1 = 1;
			while(j3_1<=5) {
				if(i3_1>=j3_1) System.out.printf("%-2c",'*');
				j3_1++;
			}
			i3_1--;
			System.out.println();
		}

	}////main

}/////class
