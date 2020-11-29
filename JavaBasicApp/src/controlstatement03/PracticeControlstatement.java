package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class PracticeControlstatement {

	public static void main(String[] args) throws IOException {
		//If문
		/* 문제 1]
		사용자가 입력한 문자가 알파벳이거나 숫자이면
		"알파벳 혹은 숫자"라고 출력하고
		아니면 "기타"라고 출력 하여라.
		(아스키 코드값 모른다고 가정) else문 불가
		참고로 영문 알파벳의		
		아스키 코드값은 대문자 A(65)~Z(90) ,소문자 a(97) ~z(122)
		*/
		System.out.println("[문제 1]-if문1");
		System.out.println("문제 1] 문자 입력");
		int asciicode = System.in.read();
		boolean isAlphabet = asciicode >= '0' && asciicode <= '9' ||
							 asciicode >= 'A' && asciicode <= 'Z' ||
							 asciicode >= 'a' && asciicode <= 'z';
		if(isAlphabet) System.out.println("알파벳 혹은 숫자");
		if(!isAlphabet) System.out.println("기타");
		
		
		/* 문제 2]
		  사용자가 입력한 값이 숫자인지 먼저 판단하고
		  숫자라면 2의 배수인지를 판단하여
		 2의 배수인 경우만 "2의 배수입니다"라고 출력하여라.
		 2의 배수가 아닌 경우 "2의 배수가 아니다"라고 출력
		  문자 '0'의 아스키 코드값:48
		        '1':49 '2':50......
		*/

		System.out.println("[문제 2]-if문1");
		System.out.println("문자 입력");
		System.in.skip(2);
		char word = (char)System.in.read();
		
		boolean isMultiple = word >= '0' && word <='9';
		System.out.println("[방법 1]");
		if(isMultiple) {
			isMultiple = (word-'0') % 2 ==0;
			if(isMultiple) {System.out.println("2의 배수");}
			if(!isMultiple) {System.out.println("2의 배수 아님");}
		}		
		System.out.println("[방법 2]");
		if(isMultiple && (word-'0') % 2 == 0) {System.out.println("2의 배수");}
		if(isMultiple && (word-'0') % 2 != 0) {System.out.println("2의 배수 아님");}
		
		/*문제 3]
		 숫자인지 판단후 2의 배수를 판단하고
		 2의 배수면 "2의 배수" 출력,아니면 "2의배수가 아님"출력
		 또한 숫자가 아니고 알파벳이라면 대소문자를 판단한후
		 대문자인경우 "대문자" 출력, 소문자인 경우 "소문자"출력
		 가정]숫자나 알파벳만 입력한다고 가정하자.
		*/

		System.out.println("[문제 3]-if문2");
		System.in.skip(2);
		char word3 = (char)System.in.read();
		boolean isNumber3 = word3 >= '0' && word3 <= '9';
		boolean isMultiple3 = (word3 - '0') % 2 == 0;
		boolean isUpper = word3 >= 'A' && word3 <= 'Z';
		if(isNumber3) {
			if(isNumber3 && isMultiple3) System.out.println("2의 배수");
			else System.out.println("2의 배수 아님");
		}
		else{
			if(isUpper) System.out.println("대문자");
			else System.out.println("소문자");
		}
		System.out.println("[삼항연산자 사용]");
		System.out.println(isNumber3?isMultiple3? "2의배수":"2의 배수 아님" : isUpper? "대문자":"소문자");
		
		/*문제 4]
		숫자인지 판단후 2의 배수를 판단하고
		2의 배수면 "2의 배수"출력,아니면 "2의 배수가 아님" 출력
		또한 숫자가 아니고 알파벳이라면 대소문자를 판단한후
		대문자인경우 "대문자" 출력, 소문자인 경우 "소문자"출력
		단, if ~else if()만이용
		*/
		System.out.println("[문제 4]-if문3");
		System.out.println("문자 입력");
		System.in.skip(2);
		char word4 = (char)System.in.read();
		if(word4 >= '0' && word4 <= '9' && (word4-'0') % 2 == 0) {
			System.out.println("2의 배수");
		}
		else if(word4 >= '0' && word4 <= '9' && (word4-'0') % 2 != 0) {
			System.out.println("2의 배수 아님");
		}
		else if(word4 >= 'A' && word4 <= 'Z') {
			System.out.println("대문자");
		}
		else if(word4 >= 'a' && word4 <= 'z') {
			System.out.println("소문자");
		}
		
		/*문제 5]	
		평균을 구해서 90점이상 "A학점"출력
		          80점이상 "B학점"출력
		          70점이상 "C학점"출력
		          60점이상 "D학점"출력
		          60점미만 "F학점"을 출력하여라
		                 단,switch문 사용
		*/
		System.out.println("[문제 5]-switch문");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수입력");
		int kor = sc.nextInt();
		System.out.println("영어 점수입력");
		int eng = sc.nextInt();
		System.out.println("수학 점수입력");
		int math = sc.nextInt();
		switch((kor+eng+math)/30) {
			case 10 :
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
		
		/*문제 6]
		1부터 100까지 숫자중 3의 배수 이거나 5의 배수인
		숫자의 합을 구해라
		단,3과5의 공배수인 경우 ,누적합에 단 한번만
		포함시켜라.
		   
		   3+5+6+9+10+12+15+18+20+21+24+25+27+30......
		*/
		System.out.println("[문제 6]-for문");
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 || i % 5 ==0)
				sum += i;
		}
		System.out.println("1부터 100까지 숫자중 3의 배수 이거나 5의 배수인 숫자의 합 : "+sum);		
		
		/* 문제 7]
		 * 1 0 0 0 
		 * 0 1 0 0 
		 * 0 0 1 0
		 * 0 0 0 1 처럼 출력해 보자
		   0 0 0 0
		 */
		System.out.println("[문제 7]-이중 for문");
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=4; k++) {
				if(i==k) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		
		/* 문제 8]
		 * 0 0 0 1  (1,4) 
		 * 0 0 1 0  (2,3)
		 * 0 1 0 0  (3,2)
		 * 1 0 0 0  (4,1)처럼 출력해 보자
		 */		
		System.out.println("[문제 8]-이중 for문");
		for(int i=4; i>=1; i--) {
			for(int k=1; k<=4; k++) {
				if(i==k) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		/*	문제 9] 
		  *
		  * *
		  * * *
		  * * * *
		  * * * * *  를 출력하여라 (이중 for문 이용) 			  
		 */
		System.out.println("[문제 9]-이중 for문");
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=5; k++) {
				if(i>=k) System.out.printf("%-2s",'*');
			}
			System.out.println();
		}
		
		/* 문제 10]아래 형식대로 구구단을 출력		
			2 * 1 = 2   3 * 1 = 3   4 * 1 = 4........9 * 1 = 9
			2 * 2 = 4   3 * 2 = 6   4 * 2 = 8........9 * 2 =18
			..
			..
			2 * 9 = 18  3 * 9 = 27  4 * 9 =36....... 9 * 9 = 81	
	    */
		System.out.println("[문제 10]-이중 for문");
		for(int i=1; i<=9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.printf("%-3s%-3s%-3s%-3s%-4s",k,'*',i,'=',i*k);
			}
			System.out.println();
		}
		
		/* 문제 11]
		1부터 1000까지 숫자중 3의 배수 이거나 5의 배수인
		숫자의 합을 구해라
		단, 3과5의 공배수인 경우 제외(while문 사용)
		*/
		System.out.println("[문제 11]- while문");
		int sum1 = 0;
		int i = 1;
		while(i<=1000) {
			if(i % 3 == 0 ^ i % 5 == 0)
			sum1+=i;
			i++;
		}
		System.out.println("1부터 1000까지 숫자중 3의 배수 이거나 5의 배수인 숫자의 합 : " + sum1);
		
		/* 문제 12]
		 * 1 0 0 0
		 * 0 1 0 0
		 * 0 0 1 0
		 * 0 0 0 1  while문으로...
		 */
		System.out.println("[문제 12]- 이중while문");
		int i2 = 1;
		while(i2<=4) {
			int k2 = 1;
			while(k2<=4) {
				if(i2==k2) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				k2++;
			}
			System.out.println();
			i2++;
		}
		
		/*문제 13]	
		  * 
		  * *
		  * * *
		  * * * *
		  * * * * *(while문으로)			 
		 */
		System.out.println("[문제 13]- 이중while문");
		int i3 = 1;
		while(i3<=5) {
			int k3 = 1;
			while(k3<=5) {
				if(i3>=k3) System.out.printf("%-2s",'*');
				k3++;
			}
			i3++;
			System.out.println();
		}
		/*문제 14]
		  아래 형식대로 구구단을 출력
			2 * 1 = 2   3 * 1 = 3   4 * 1 = 4........9 * 1 = 9
			2 * 2 = 4   3 * 2 = 6   4 * 2 = 8........9 * 2 =18
			..
			..
			2 * 9 = 18  3 * 9 = 27  4 * 9 =36....... 9 * 9 = 1	
			
			while문으로...
	    */
		System.out.println("[문제 14]- 이중while문");
		int i4 = 1;
		while(i4<=9) {
			int k4 = 2;
			while(k4<=9) {
				System.out.printf("%-3d%-3c%-3d%-3c%-4d",k4,'*',i4,'=',i4*k4);
				k4++;
			}
			i4++;
			System.out.println();
		}
		

	}//main

}///class
