package array04;

import java.util.Scanner;

public class PracticeArrayExample {
	
	public static final int SUBJECTS = 3;
	public static void main(String[] args) {
		/*
		  *1] 학생수를 사용자로부터 입력받자
		  *   -Scanner클래스 사용
		  *2] 입력받은 학생 수만큼 국영수 점수 및 총점를 저장할수 있는
		  *   int형 배열을 선언하고  메모리를 할당해라
		  *3] 학생 수만큼 각 학생의 국영수 점수를 입력받아
		  *   2]에서 생성한 배열에 저장해라.* 
		  *    -Scanner클래스 사용
		  *4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
		  */
		String[] subject = {"국어", "영어", "수학"};
		Scanner sc = new Scanner(System.in);
		//1] 학생수를 사용자로부터 입력받자
		System.out.println("학생 수 입력");
		int numberOfStudent = sc.nextInt();
		//2] 입력받은 학생 수만큼 국영수 점수 및 총점를 저장할수 있는 int형 배열을 선언하고  메모리를 할당해라
		int[][] student = new int[numberOfStudent][SUBJECTS+1];
		//3] 학생 수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장해라. -Scanner클래스 사용
		for(int i=0; i<student.length; i++) {
			System.out.println(i+1 + "번째 학생 점수 입력 : ");
			int total = 0;
			for(int k=0; k<SUBJECTS; k++) {
				System.out.println(subject[k]+"점수 입력 : ");
				//각 과목 점수 입력받기
				student[i][k] = sc.nextInt();
				//total에 총점 누적
				total += student[i][k];
			}
			//총점을 마지막 방에 저장
			student[i][SUBJECTS] = total;
		}
		//4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
		for(int i=0; i<numberOfStudent; i++) {
			System.out.println("======================================================");
			System.out.println("                       "+(i+1)+"번째 학생 점수");
			System.out.println("======================================================");
			//국영수 점수 /총점 그리고 /평균 출력
			System.out.printf("국어 : %s  영어 : %s  수학 : %s  총점 : %s  평균 : %s%n",
				student[i][0],
				student[i][1],
				student[i][2],
				student[i][3],
				(double)student[i][3]/SUBJECTS);
			System.out.println("======================================================");
		}

	}///////main

}/////class
