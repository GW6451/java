package array04;

import java.util.Scanner;

public class practiceArray01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = {11,10,23,56,81,97,53,70,50,64};
		int sum1 = 0; //누적합 저장용]
		//문1] int형 배열 jumsu에 저장된 점수의 총합과 평균을 구해라 그리고
		int avg1 = 0;
		for(int i1=0; i1<jumsu.length; i1++) {
			sum1 += jumsu[i1];
			avg1 = sum1/jumsu.length;
		}
		System.out.println("점수총합:"+sum1+"  평균:"+avg1);
		
		//문2]상 jumsu배열에 저장된 값 중 최대값을 구하여라
		int max1 = jumsu[0];
		for(int i1=0; i1<jumsu.length;i1++) {
			if(max1<jumsu[i1]) max1 = jumsu[i1];
		}
		System.out.println("최대값 : "+max1);
		
		//문3]일차원 배열을 크기 순서대로 재 배치 후 출력하라
		for(int i1=0; i1<jumsu.length; i1++) {
			for(int j1=0; j1<jumsu.length; j1++) {
				if(jumsu[i1]>jumsu[j1]) {
					int temp = jumsu[j1];
					jumsu[j1] = jumsu[i1];
					jumsu[i1] = temp;
				}
			}
		}
		for(int i1=0; i1<jumsu.length; i1++) 
			System.out.print(jumsu[i1] + " ");
		System.out.println();
		
		/*
		 1 9 9 9 9
		 9 1 9 9 9
		 9 9 1 9 9
		 9 9 9 1 9
		 */
		//문1]2차원 배열을 선언시 선언과 동시에 메모리를 할당해라
	
		int[][] arrType = new int[4][5];
		//문2]위의 값을 1번에서 선언한 배열에 저장해라
		for(int i=0; i<arrType.length; i++) {
			for(int k=0; k<arrType[i].length; k++) {
				if(i==k) arrType[i][k]= 1;
				else arrType[i][k]= 9;
			}
		}
		//문3]2차원 배열에 저장된 값을 위 모양대로 출력해라
		for(int i=0; i<arrType.length; i++) {
			for(int k=0; k<arrType[i].length; k++) {
				System.out.printf("%-2d",arrType[i][k]);
			}
			System.out.println();
		}
	}////main

}////class
