package array04;

import java.util.Scanner;

public class ArrayType01 {

	public static void main(String[] args) {
		/*
		 배열 : 하나의 이름(배열명)으로 같은 자료형의 데이터를 여러개 저장할 수 있는 메모리구조
		  		(메모리가 연속적으로 생김) - 참조형
		 */
		//1차원(선형) 배열]
		//1]배열 선언		
		/*
		 arrNum이라는 배열명으로 int형의 배열을 선언하는것
		 arrNum이라는 이름으로 Stack영역에 주소를 저장할 수 있는 메모리가 생김
		 */
		int [] arrNum;//1차원배열
		//arrNum = 100;[x]데이터 저장 불가
		//2]메모리 할당 - 실제값을 저장할 수 있는 메모리를 heap영역에 생성하기 위해 new연산자 사용
		
		arrNum = new int[5];// 5는 배열크기 즉 메모리의 개수, 실제 데이터를 저장할 메모리를 heap영역에 할당하라는 의미
		//arrNum은 실제 데이터를 저장하는 메모리의 주소가 저장됨
		System.out.println(arrNum);
		/*
		 배열명[숫자]를 배열 요소명이라함
		 숫자는 배열인덱스라고 한다
		 배열에서 인덱스는 항상 0부터시작
		 배열명[숫자] 즉 배열요소명은 변수처럼 사용할수 있다
		 */
		//3]배열 초기화
		/*
		 배열은 초기화를 하지 않아도 해당 자료형의 기본값으로 설정된다
		 int : 0, double : 0.0 boolean : false, char ''
		 */
		System.out.println("[배열 초기화 전]");
		for(int i=0; i<5;i++) {
			System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
		}
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[4] = 50;
		System.out.println("[배열 초기화 후]");
		for(int i=0; i<5; i++) {
			System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
		}
		/*
		 배열의 크기를 벗어난 인덱스는 컴파일은 되지만 실행시 에러
		 */
		//arrNum[5] = 60;[x]실행시 에러
		//4]출력
		/*
		 배열의 크기 얻기 : 배열명.length
		 */
		System.out.println("배열의 크기:"+arrNum.length);
		for(int i=0; i<arrNum.length; i++) {
			if(arrNum.length-1 == i)
				System.out.printf("arrNum[%d]:%d ",i,arrNum[i]);
			else
				System.out.printf("arrNum[%d]:%d ",i,arrNum[i]);
		}
		System.out.println();
		//5]배열선언과 동시에 메모리 할당
		String strArray[] = new String[3];
		System.out.println(strArray);
		System.out.println("[배열 초기화 전]");
		for(int i=0; i < strArray.length; i++) {
			System.out.printf("%d인덱스 방 : %s%n", i, strArray[i]);
		}
		//String형 배열 초기화]
		strArray[1] = "소프트웨어";
		strArray[0] = "한국";
		strArray[2] = "인재 개발원";
		System.out.println("[배열 초기화 후]");
		for(int i=0; i < strArray.length; i++) {
			System.out.printf("%d인덱스 방 : %s%n", i, strArray[i]);
		}
		//6]배열 선언과 동시에 초기화
		//방법1] {}배열 초기화자만 사용
		//double[] dbArr = {100,3.14,99.9};
		//방법2] = new 자료형[]{}
		double[] dbArr = new double[]{100,3.14,99.9};
		for(int i=0; i < dbArr.length; i++) {
			System.out.printf("%d인덱스 방 : %.2f%n", i, dbArr[i]);
		}
		/*
		boolean blArr[];//boolean형 배열 선언
		blArr = {true, 3>2, 3>2 && 5<3, false};[x]배열 선언 후 초기화자로 초기화 안됨*/
		
		boolean blArr[]={true, 3>2, 3>2 && 5<3, false};
		for(int i=0; i < blArr.length; i++) {
			System.out.printf("%d인덱스 방 : %b%n", i, blArr[i]);
		}
		/*
		 Scanner 클래스의 메소드 정리]
		 예] 사용자가 12(엔터) 치면 버퍼에 1|2|'\r'|'\n' 저장됨
		 nextInt() : 버퍼에 있는 엔터값(\r\n)은 읽지 않는다
		 nextInt()는 숫자만 읽는다
		 nextLine()는 엔터값도 읽는다 하지만 엔터값을 제외한 부분만 반환한다
		 */
		//[학생 수만큼 이름 입력받기]
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int numberOfStudents = sc.nextInt();
		System.out.println("입력 받은 학생수"+numberOfStudents);
		sc.nextLine();//엔터값 읽어서 사용안함
		//String name= sc.nextLine();
		//System.out.println(name);
		String[] names = new String[numberOfStudents];
		
		for(int i=0; i < names.length;i++) {
			System.out.printf("%d번째 학생의 이름을 입력하세요%n",i+1);
			names[i] = sc.nextLine();
		}
		//출력
		for(int i=0; i < names.length;i++) {
			System.out.printf("%d번째 학생의 이름:%s%n", i+1, names[i]);
		}
		int[] jumsu = {11,10,23,56,81,97,53,70,50,64};
		int sum = 0; //누적합 저장용]
		//문] int형 배열 jumsu에 저장된 점수의 총합과 평균을 구해라 그리고
		double avg = 0;
			for(int i=0; i<jumsu.length ; i++) {
				sum += jumsu[i]; 
				avg = sum/jumsu.length;
		}
			System.out.printf("점수 총합 : %d , 평균 : %.2f%n ", sum, avg);
		//문]상 jumsu배열에 저장된 값 중 최대값을 구하여라
		int max = jumsu[0];
			for(int i=0; i<jumsu.length;i++) {
			if(max < jumsu[i]) max = jumsu[i];
		}
			System.out.println("최대값 : "+ max);
		//문]일차원 배열을 크기 순서대로 재 배치 후 출력하라
			for(int i=0; i< jumsu.length-1; i++) {
				for(int k=i+1; k<jumsu.length;k++) {
					if(jumsu[i]<jumsu[k]) {
						int temp = jumsu[k];
						jumsu[k] = jumsu[i];
						jumsu[i] = temp;
					}
				}
			}
			for(int i=0; i<jumsu.length;i++) 
				System.out.print(jumsu[i] + " ");
		
								
	}////main

}////class
