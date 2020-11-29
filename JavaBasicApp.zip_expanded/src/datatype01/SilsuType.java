package datatype01;

import java.math.BigDecimal;

public class SilsuType {

	public static void main(String[] args) {
		//*실수형에서 대표 자료형은 double이다.
		//규칙1]정수형보다 실수형이 더 큰 그릇이다
		//long(정수형):8byte, float(실수형):4byte
		long ln = 100;
		float f1 = 200;
		///long ln1 = ln+f1;//long형과 float형의 연산자는 float형이다
		//방법1]연산결과인 float형에 저장
		float f2 = ln+f1;
		System.out.println("f2="+f2);
		//방법2] 연산결과 전체를 lng형으로 형변환
		long ln1 = (long)(ln+f1);
		System.out.println("ln1="+ln1);
		//tip)주로 소수점 이하를 제거하고자 할때
		//int 형으로 형변환 하면 된다
		float kor=99, eng=80, math=96;
		float avg =(kor+eng+math)/3;
		System.out.println("평균:"+avg);
		System.out.println("평균(소수점제거):"+(int)avg);
		
		int kor1=99, eng1=80, math1=96;	
		double avg1 =(kor1+eng1+math1)/3.0;
		System.out.println("평균:"+avg1);
		System.out.println("평균(소수점제거):"+(int)avg1);
		
		/*
		 규칙2]실수형에서 기본 데이타 타입은 double이다
		     소수점이 붙으면 무조건 double형으로 인식
		     단, 소수점이 붙지 않은 값은 float에 담을 수 있다.*/
		//float f3 = 3.14;[x] 3.14는 double형 상수
		float f3 = 100;
		//방법1]형변환
		f3 = (float)3.14;
		System.out.println("f3="+f3);
		/*
		 컴파일러에게 소수점이 붙은 숫자를 float형으로 인식시키기 위해 숫자 뒤에 F나 f를 붙인다
		 */
		//방법2] 실수 숫자 뒤에 f나 F (권장)
		f3 = 3.14F; //3.14는 float형 상수
		System.out.println("f3="+f3);
		//규칙3] 실수형도 같은 자료형끼리의 연산결과는 같은 자료형, 큰자료형과 작은 자료형과의 연산결과는 큰 자료형
		float ff1=100, ff2=3.14f, fresult;
		double d1=100, d2=3.14, dresult;
		fresult = ff1+ff2;
	    System.out.println("fresult="+fresult);
		dresult = d1+d2;
		System.out.println("dresult="+dresult);
		
		/*문제1]반지름이 10인 원의 면적을 구해라
		 단, 면적을 저장하는 변수의 타입을 3가지 형태(int/float/double)의 자료형에 저장하여 출력하여라 그리고 소수점을 제거하여라
		 원의 면적 : 반지름 *반지름*3.14
		 단, 아래의 변수 radius 와 pi를 사용해서 구해라 */
		int radius = 10;
		double pi =3.14;
		//면적을 저장하는 변수
		int iarea;
		float farea;
		double darea;
		//int형
		iarea = (int)(radius*radius * pi);
		//iarea = radius*radius * (int)pi;[X] : 논리적인 오류
		System.out.println("iarea="+iarea);
		//float형
		farea = (float)(radius*radius*pi);
		System.out.println("farea="+(int)farea);
		//double형
		darea = radius*radius*pi;
		System.out.println("darea="+(int)darea);
		d1 = 0.1;
		d2 = 0.2;
		System.out.println(d1+d2);//0.30000000000000004 부동소수점
		System.out.println(d1*d2);
		System.out.println(d1+d2 == 0.3);//c언어에서 쓰는 고정 소수점에서는 true로 나옴, 논리적인 오류
		//부동 소수점 오차 처리]
		//방법1]
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		System.out.println(big1.add(big2));
		BigDecimal big_add=big1.add(big2);
		BigDecimal big3 = new BigDecimal("0.3");
		System.out.println(big_add.compareTo(big3)==0);//0이 나오는 이유는 같기 때문이다
		System.out.println(big1.multiply(big2));
		
		//방법2]
		BigDecimal big4 = new BigDecimal(0.1);
		BigDecimal big5 = new BigDecimal(0.2);
		BigDecimal big6=big4.add(big5);
		System.out.println(big6);
		System.out.println(big6.compareTo(new BigDecimal(0.3)));
	}

}
