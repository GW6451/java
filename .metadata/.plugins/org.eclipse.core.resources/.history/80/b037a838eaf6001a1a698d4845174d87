package controlstatement03;

import java.io.IOException;

public class WhileStatement {
		
	public static void main(String[] args) throws IOException {
		//while문 주로사용
		//형식:
		/*
		  [초기식;]
		  while(반복조건){
		  	반복조건이 참일때 실행할 명령문들;
		  		[증감식;]
		  }
		  무한루프 처리]
		  while(true){
		  	실행할 명령문들;
		  	}
		 */
		//while(int i = 0)//[x]초기식은 for문에서만 사용가능
		//1부터 10까지 누적합 : while문 사용
		//누적합을 저장할 변수 선언
		int sum = 0;
		int i = 1;
		while(i<=10) {
			sum+=i;//[명령문]
			i++;
		}//i증감식이 없으면 무한루프에 빠짐 
		System.out.println("1부터 10까지 누적합:"+sum);//
		System.out.println("while문이 끝난후 i:"+i);
		/*
		 문제1]
		 1부터 1000까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수는 제외시켜라(for문 사용)*/
		sum = 0;
		i = 1;
		while(i<=1000) {
			if((i % 3 ==0 || i % 5 ==0) && i % 15 != 0) sum += i;
			//if(i%3==0^i%5 ==0) sum +=i;
			i++;
			
		}
		System.out.println("1부터 1000까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합(공배수 제외):"+sum);
		//사용자가 몇 자를 입력할지 모름으로 while문 사용.(for문도 가능)
		System.out.println("문자열을 입력하세요?");
		char word;
		//for (;(word=(char)System.in.read()) != 13;) { : for문으로 변경식
		while((word=(char)System.in.read()) != 13) {
			System.out.print(word);
		}
		System.out.println();
		
		/*
		 문제2]
		 * 0001 
		 * 0010   형태로 만들어라(이중 for문)
		 * 0100
		 * 1000
		 */
		int k=1;//바깥 while의 초기식
		while(k<=4) {
			int j=1;//안쪽 while의 초기식
			while(j<=4) {
				if(k==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				j++;//안쪽 while의 증감식
			}
			//j=1;//안쪽while의 초기식을 바깥쪽 while에 위치시킬때 초기화해야함
			System.out.println();
			k++;
		}
		/*
		 문제3]
		 *         1,1
		 * *       2,1 2,2
		 * * *     3,1 3,2 3,3
		 * * * *   4,1 4,2 4,3 4,4
		 * * * * * 5,1 5,2 5,3 5,4 5,5
		 */
		k=1;
		while (k<=5) {
			int j = 1;
			while (j<=5) {
				if(k>=j) System.out.printf("%-2c",'*');
				j++;
			}
			System.out.println();
			k++;
		}
		
		/*
		 문제4] 구구단을 출력하라*/
		k=1;
		while (k<=9) {
			int j = 2;
			while (j<=9) {
				System.out.printf("%-3d%-3c%-3d%-3c%-5d",j,'*',k,'=',k*j);
				j++;
			}
			System.out.println();
			k++;
		}
		//무한루프
		while(true) {
			System.out.println("무한루프");
			break;
		}
		System.out.println("프로그램 끝");
			
	}///main

}///class
