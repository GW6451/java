package controlstatement03;

public class ForStatement {

	public static void main(String[] args) {
		/*
		 for문 : 어떤 명령문들을 반복하고자 할때 사용하는 제어문
		 
		 형식:
		 
		 반복순서 :
		 
		 초기식->반복조건->참인경우 for문 안으로(거짓인 경우 for문을 빠져 나감)->증감식->반복조건->참인경우 for문 안으로->증감식->반복조건->...
		 
		 for(초기식; 반복조건(조건식) ; 증감식){
		 	
		 	 반복 조건이 참일때 실행할 명령문들;
		 	 
		 }
		 
		 반복조건이 없거나 조건대신에 true를 지정하면 무조건 무한 루프
		 예]
		 	for(;;){
		 	}
		 	for(;true;){
		 	}
		 */
		//반복문을 이용해서 1부터 10까지 누적합 : 1+2+3+4+5+6+7+8+9+10
		int sum = 0;//누적합을 저장할 변수 선언]
		for (int i=1;i<=10;i++) {
			sum+=i; //sum ==sum+i
		}
		System.out.println("1부터 10까지 누적 합:"+sum);
		//1부터10까지의 숫자중 2의 배수의 합 : 2+4+6+8+10
		sum = 0;
		for(int  i=0;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("1부터 10까지 2의배수의합:"+sum);
		//방법2] 1부터 1씩증가하면서 10까지 반복하면서  i의 값이 2의 배수인 경우에만 누적
		sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1부터 10까지 2의배수의합:"+sum);
		//*for문의 초기식에서 선언된 i는 for문이 끝나면 메모리에서 사라짐
		//System.out.println("for문이 끝난후 i의 값:"+i);//[x]
		int i=5;
		for(;i < 10;i++) { }
		System.out.println("for문이 끝난후 i의 값:"+i);
		for(int k =10; k>0; k--) {
			System.out.println("HELLOWORLD");
		}
		/*문제 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수인 경우, 누적합에 단 한번만 포함시켜라*/
		 sum = 0;
		for(int i1=1; i1 <= 100; i1++) {
			if(i1 % 3 ==0 || i1 % 5 == 0) sum += i1;
		}
		System.out.println("1부터 100까지 3의배수이거나 5의 배수의합:"+sum);
		/*문제 1부터 100까지 숫자중 3의배수 이거나 5의 배수인 숫자의 합을 구해라
		  단, 3과 5의 공배수는 제외시켜라*/
		sum = 0;
		for(i=1; i<=100; i++) {
			if((i % 3 == 0 || i % 5 == 0) && i % 15 != 0) sum += i; 
		
		}
		System.out.println("1부터 100까지 3의배수이거나 5의 배수의합(3과 5의공배수제외):"+sum);
		//방법2] 배타연산
		sum=0;
		for(i=1; i<=100; i++) 
			if(i%3==0 ^ i%5==0) sum+=i;
		System.out.println("1부터 100까지 3의배수이거나 5의 배수의합(3과 5의공배수제외):"+sum);
		/*
		 이중(중첩) for문 : for문 안의 for문
		 이중 for문에서 바깥for문은 행(row)
		 이중 for문에서 안쪽for문은 열(column)
		 */
		int repeatCount = 1;
		for (int k=0; k<3; k++) {
			System.out.printf("[k가 %d일때]%n",k);
			for(int j=1; j<=3;j++) {
				System.out.printf("j는 %d, 반복회수:%d%n",j,repeatCount++);
			 }
		 }
		/*
		 * 1000
		 * 0100
		 * 0010
		 * 0001
		 * 0000
		 */
		for(int k=1; k<=5; k++) {//행을 의미
			for(int j=1; j<=4; j++) {//열을 의미
				if(k==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);				
			}
			//줄바꿈
			System.out.println();
		}
		
		/*
		 * 0001
		 * 0010
		 * 0100
		 * 1000
		 */
		System.out.println("[증가 연산자 사용]");
		for(int k=1; k<5; k++) {
			for(int j=1; j<5; j++) {
				if(k+j  ==5) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		//방법2]
		System.out.println("[감소연산자 사용]");
		for(int k=1; k<=4; k++) {
			for(int j=4; j>=1; j--) {
				if(k==j) System.out.printf("%-2d",1);
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
		System.out.println("[25번반복]");
		for(int k=1; k<=5; k++) {
			for(int j=1; j<=5; j++) {
				if(k>=j) System.out.printf("%-2s","*");			 
			}
			System.out.println();
		}	
		System.out.println("[15번반복]");
		for(int k=1; k<=5; k++) {
			for(int j=1; k>=j; j++) {
				if(k>=j) System.out.printf("%-2s","*");	 
			}
			System.out.println();
		}	
		/*문제]**
		아래 형식대로 구구단을 출력하라*/
		System.out.println("[구구단]");
		for(int k=1; k<=9; k++) {
			for(int j=2; j<=9 ; j++) {
				//System.out.printf("%-2d%-2c%-2d%-2c%-5d", j ,'*',k,'=', k*j);
				System.out.printf("%d * %d = %-3d", j, k, k*j);
			}
			System.out.println();
		}
		//무한반복
		for(;;) {
			System.out.println("무한반복");
			break;
		}
		System.out.println("프로그램 끝");//무한대로 반복되기 때문에  코드가 도달하지 않기 때문에 break; 문 필요
		
		
		
		
	}////main

}/////class
