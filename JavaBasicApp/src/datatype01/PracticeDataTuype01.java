package datatype01;

public class PracticeDataTuype01 {

	public static void main(String[] args) {
	//정수형&실수형 자료형
		//문1]
		/*반지름이 10인 원의 면적을 구해라
		   단,면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의
		   자료형에 저장하여 출력하여라 그리고 소수점을 제거하여라
		   원의 면적:반지름*반지름*3.14
		   단,아래의  변수 radius 와 pi를 사용해서 구해라*/
		System.out.println("[문제 1]-실수형&정수형");
		int radius = 10;
		double pi = 3.14;
		int iarea;
		float farea;
		double darea;
		System.out.println("===iarea값===");
		iarea = (int)(radius*radius*pi);
		System.out.println(iarea);
		System.out.println("===farea값===");
		farea = radius*radius*(float)pi;
		System.out.println((int)farea);
		System.out.println("===darea값===");
		darea = radius*radius*pi;
		System.out.println((int)darea);
	}////main

}////class
