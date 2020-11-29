// constantVariable 연습
package datatype01;

import java.math.BigDecimal;//java.lang에 없어서 import작성

public class Practice {
	static final double PI = 3.14;
	static final int SCISSORS = 1;
	static final int ROCK =2;
	static final int PAPER =3;

	public static void main(String[] args) {
		System.out.println(PI);
		final String Nickname;
		Nickname = "한소인";
		System.out.println(Nickname);
		
		int computer = 1;
		int user = 2;
		System.out.println("Computer Lose : 가독성 낮음");
		computer = SCISSORS;
		user = ROCK;
		System.out.println("Computer Lose : 가독성 높음");
// jungsuType 연습
		byte b1;
		b1 = 127;
		System.out.println("b1="+b1);
		b1 = (byte)128;
		System.out.println("b1="+b1);
		byte b2=20, b3=30;
		int num1 = b2 + b3;//byte 끼리의 연산자는 int형으로 바뀜
		byte b4 = (byte)(b2+b3);
		System.out.println("b4="+b4);
		short s1=1000, s2=2000;
		num1 = s1 + s2;
		System.out.println("num1="+num1);
		short s3 = (short)(s1+s2);
		System.out.println("s3="+s3);
		
		int num2=100, num3=200;
		long ln1=1000, ln2=2000;
		int num4= num2 + num3;
		long ln3= ln1 + ln2;
		System.out.println("num4="+num4);
		System.out.println("ln3="+ln3);
		int num5 =(int)ln1+num2;
		System.out.println("num5="+num5);
		long ln4= 2200000000L;//숫자로 표현된 모든 숫자는 int형식 => 정수형의 대표 자료형
		System.out.println("ln4="+ln4);
		
		num5 = 0412;
		System.out.println("num5="+num5);
		num5 = 0x1F;
		System.out.println("num5="+num5);
		
		int kor, eng, math, total;
		kor=88;  eng=90; math=100;
		total = kor + eng + math;
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+ math);
		System.out.println("총합:"+total);
		
		
//SilsuType 연습
		long ln = 100;
		float f1 = 200;
		float f2 = ln + f1;
		System.out.println("f2="+f2);
		long ln5 = (long)(ln + f1);
		System.out.println("ln5="+ln5);
		float kor1=80, eng1=90, math1=100;
		float avg = (kor1+eng1+math1)/3;
		System.out.println("평균:"+avg);
		System.out.println("평균(소수점 제거):"+(int)avg);
		int kor2=80, eng2=90, math2=100;
		double avg1 = (kor2+eng2+math2)/3.0;
		System.out.println("평균:"+avg1);
		System.out.println("평균(소수점제거):"+(int)avg1);
		
		int radius = 10;
		double pi =3.14;
		int iarea;
		float farea;
		double darea;
		
		iarea = (int)(radius*radius*pi);
		farea = (float)(radius*radius*pi);
		darea = radius*radius*pi;
		System.out.println("iarea="+iarea);
		System.out.println("farea="+(int)farea);
		System.out.println("darea="+(int)darea);
		BigDecimal big1 = new BigDecimal ("0.1");
		BigDecimal big2 = new BigDecimal ("0.2");
		System.out.println(big1.add(big2));
		BigDecimal big_add = big1.add(big2);
		BigDecimal big3 = new BigDecimal ("0.3");
		System.out.println(big_add.compareTo(big3)==0);
		System.out.println(big1.multiply(big2));
		
		BigDecimal big4 = new BigDecimal (0.1);
		BigDecimal big5 = new BigDecimal (0.2);
		BigDecimal big6 = big4.add(big5);
		System.out.println(big6);
		System.out.println(big6.compareTo(new BigDecimal(0.3)));
		
		char ch1;
		ch1 = '가';
		System.out.println("ch1="+ch1);
		char ch2;
		ch2 = 'A';//문자A는 65의 아스키코드값
		int num6=2;
		System.out.println(ch2+num6);
		int num7=ch2+num6;
		System.out.println("num7(아스키코드값)="+num7);
		char ch3 = (char)(ch2 + num6);
		System.out.println("ch3="+ch3);
		
		char ch4 = '1';
		char ch4_1 = 49;
		System.out.println("ch4="+ch4+",ch4_1="+ch4_1);
		
		char ch5 = 'a';
		char ch5_1 = 97;
		System.out.println("ch5="+ch5+",ch5_1="+ch5_1);
		
		boolean b5 = true;
		boolean b6 = false;
		System.out.println(b5&&b6);
		boolean b7 = '가' > 3000;
		System.out.println("b7="+b7);
		
//StringType 연습
		
		int number;
		number = 99;
		String strNumber = "100";
		System.out.println(strNumber+number);
		String newString = new String("new 연산자 사용");
		System.out.println(newString);
		String stringLikeBasic;
		stringLikeBasic = "기본연산자처럼 사용";
		String plusString;
		plusString = newString + "," + stringLikeBasic;
		System.out.println(plusString);
		int kor3 = 100, eng3=100, math3=100;
		System.out.println("총점:"+kor3+eng3+math3);
		System.out.println("총점:"+(kor3+eng3+math3));
		
//EscpapeChar 연습
		//\t 연습
		System.out.println("HitHomeRun");
		System.out.println("Hi\tHomeRun");
		//\n 연습
		System.out.println("Go!Go!Go!");
		System.out.println("Go!\nGo!\nGo!");
		//\r 연습
		System.out.println("Hello I'm Kim");
		System.out.println("Hello I'm Kim \rXXXXX");
		//\' 연습
		System.out.println("Hello I'm 'Kim'");
		System.out.println("Hello I'm \'Kim\'");
		//\''연습
		System.out.println("Hello I'm \"Kim\"");
		//\\연습
		System.out.println("D:\nDrive\table");
		System.out.println("D:\\nDrive\\table");
		
		
		
	}

}


	

