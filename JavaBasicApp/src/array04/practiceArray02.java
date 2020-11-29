package array04;

import java.util.Scanner;

public class practiceArray02 {
	public static final int SUBJECTS= 3;
	public static void main(String[] args) {
		/*
		 * 1] 학생수를 사용자로부터 입력받자 : Scanner클래스 사용
		 * 2] 입력받은 학생 수만큼 국영수 점수 및 총점을 저장할 수 있는 int형 배열을 선언하고 메모리를 할당해라
		 * 3] 학생 수만큼 국영수 점수를 입력받아 2]에서 생성한 배열에 저장해라
		 * 4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력해라
		 */
		String[] subjects = {"국어", "영어", "수학"};
		Scanner sc = new Scanner(System.in);
		///1] 학생수를 사용자로부터 입력받자 : Scanner클래스 사용
		System.out.println("학생 수 입력");
		int numberOfStudents = sc.nextInt();
		///2] 입력받은 학생 수만큼 국영수 점수 및 총점을 저장할 수 있는 int형 배열을 선언하고 메모리를 할당해라
		int[][] students = new int[numberOfStudents][SUBJECTS+1];
		///3] 학생 수만큼 국영수 점수를 입력받아 2]에서 생성한 배열에 저장해라
		for(int i=0; i<students.length; i++) {
			System.out.println(i+1+"번째 학생 이름");
			int total = 0;
			for(int k=0; k<SUBJECTS;k++) {
				System.out.println(subjects[k]+"점수 입력");
				students[i][k] = sc.nextInt(); total+=students[i][k]; 
			}
			students[i][SUBJECTS]= total;
		///4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력해라
			
		}
		
	}////main

}/////class
