package array04;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		//[학생 수만큼 이름 입력받기]
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int numberOfStudent = sc.nextInt();
		System.out.println("학생 수 : " + numberOfStudent);
		sc.nextLine();
		String[] name = new String[numberOfStudent];
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s번 째 학생의 이름 입력 : ", i+1);
			name[i] = sc.nextLine();
		}
		//출력]
		for(int i=0;i<name.length; i++) {
			System.out.printf("%s번 째 학생 이름 : %s%n", i+1,name[i]);
		}
		//문제 1] int형 배열 jumsu에 저장된 점수의 총합과 평균을 구해라 그리고 출력하여라.
		System.out.println("[문제 1]-1차원 배열");
		int[] jumsu = {100, 55, 66, 77, 99};
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		System.out.printf("총점 : %s점, 평균 : %s점", sum, (sum/jumsu.length));
		System.out.println();
		//문제 2]상기 jumsu배열에 저장된 값 중 최대값을 구하여라.
		System.out.println("[문제 2]-1차원 배열");
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i]) max =jumsu[i];				
			}
		System.out.println("최댓값 : " + max);
		//문제 3]일차원 배열을 크기 순서대로 재 배치후 출력하자.
		System.out.println("[문제 3]-1차원 배열");
		for(int i=0; i<jumsu.length-1;i++) {
			for(int k=i+1; k<jumsu.length; k++) {
				if(jumsu[i]<jumsu[k]) {
					int temp = jumsu[i];
					jumsu[i] = jumsu[k];
					jumsu[k] = temp;
				}
			}
		}
		for(int i=0; i<jumsu.length; i++)
			System.out.printf("%-4d", jumsu[i]);
		System.out.println();
		
		/*   
		   1 9 9 9 9
		   9 1 9 9 9
		   9 9 1 9 9
		   9 9 9 1 9     
	   */
		//문제 4]2차원 배열을 선언시 ,선언과 동시에 메모리를 할당해라.
		//문제 4-1]위의 값을 1번에서 선언한 배열에 저장해라.
		//문제 4-2] 2차원 배열에 저장된 값을  위 모양대로 출력하여라
		System.out.println("[문제 4]-2차원 배열");
		int[][] num = new int[4][5];
		for(int i=0; i<num.length; i++) {
			for(int k=0; k<num[i].length; k++) {
				if(i==k) num[i][k] = 1;
				else num[i][k] = 9;
				System.out.printf("%-2d",num[i][k]);
			}
			System.out.println();
		}
		
		

	}

}
