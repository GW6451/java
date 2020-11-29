package datatype01;

public class jungsuType {
	
			public static void main(String[] args) {
			/*
			원칙1] 큰 자료형과 작은 자료형의 연산 결과는 큰 자료형을 따른다. ex)+, -, =, >, <
			원칙2] 같은 자료형끼리의 연산결과는 같은 자료형이된다. 
			      int보다 작은 자료형의 연산결과는 int형이 된다.(byte, short, char)
			 */
			//규칙1] 기본 자료형중 수치형의 정수형의 대표 자료형은 int형이다.
			byte b1;
			b1=127;
			System.out.println("b1="+b1);
			
			b1 =(byte)128;
			System.out.println("b1="+b1);//-128
			//규칙2]int형보다 작은 자료형(byte, short, char)들의 연산결과는 int형이다.(예외 속하는것)
			byte b2=20, b3=30;// 위 127은 상수기 때문에 변하지 않는 값이고 b2, b3는 변수기 때문에 변할 수 있는 값이기 때문에 에러가 난다.
			//byte b4=b2+b3;
			//방법1]연산결과인 int형에 담는다.
			int num1 = b2+b3;
			System.out.println("num1="+num1);
			//방법2]연산결과 전체를 byte형으로 형변환
			byte b4=(byte)(b2+b3);
			System.out.println("b4="+b4);
			short s1=1000,s2=2000;
			///short s3= s1+s2; //[x]
			num1 = s1+s2;//[o]
			System.out.println("num1="+num1);
			short s3=(short)(s1+s2);
			System.out.println("s3="+s3);
			/* 규칙3]정수형에서 int형보다 작은 자료형들을 제외한 자료형들끼리(int, long)의 연산 결과는 모두 원칙을 따른다.
			                즉 int형과 int형의 연산결과는 int형
			          long형과 long형의 연산결과는 long형
			          int형과 long형의 연산결과는 long형
			*/
			int num2=100, num3=200;
			long ln1=1000, ln2=2000;
			num1 = num2 + num2; //[o] 연산결과 int형
			System.out.println("num1="+num1);
			long ln3 = ln1+ln2; ///[o]연산결과 long형
			System.out.println("ln3="+ln3);
			
			///int num4 = ln1 + num2;//[x]
			//방법1] 연산결과 전체를 int형을 변환
			int num4 = (int)(ln1 + num2);
			System.out.println("num4="+num4);
			//방법2]long형인 ln1만 int 형으로 형변환
			//     int형끼리의 연산은 int형이니까
		    num4 = (int)ln1 + num2;
		    System.out.println("num4="+num4);
		    
		    ///long ln4 = 2200000000;///[x]소수점이 붙지 않은 모든 숫자는 int로 인식
		    /*
		       컴파일러에게 22억이라는 수자는 int형 상수가 아닌 long형 상수라는 것을 알려주기 위해 숫자뒤에 l(소문자)이나 L을 붙인다
		     */
		    long ln4 = 2200000000L;//[o]
		    System.out.println("ln4="+ln4);
		    num4 = (int)2200000000l;
		    System.out.println("num4="+num4);
		    
		    //규칙5] 숫자 앞에 0이 붙으면 8진수를 의미한다.
		    num4 = 0412; /// 4*8^2 + 1*8^1 + 2*8^0 = 256+8+2 = 266
		    System.out.println("num4="+num4);
		    //규칙6] 숫자 앞에 0x(0X)가 붙으면 16진수를 의미
		    //0 1,2...9,A(10을 의미), B,C,D,E,F(15를 의미)
		    num4 = 0x1F;
		    System.out.println("num4="+num4);
		    //1]국어,영어,수학 점수 및 점수 총합을 저장할 수 있는 변수 4개 선언(int형)
		    int 국어; /// int kor, eng ,math, total
		    int 영어;
		    int 수학;
		    int 총합;
		    //2]국어에는 89,영어는 99, 수학은 78을 저장하여라
		    국어 = 89;///kor=89;eng=99;math=78;
		    영어 = 99;
		    수학 = 78;		    
		    //3]국영수의 총합을 구해서 총합 저장용 변수에 저장하여라
		    총합 = 국어 + 영어 + 수학;		    
		    //4]각 국영수 점수 및 총합을 출력하여라
		    System.out.println("국어:"+국어); ////System.out.println("국어:"+국어,"영어:"+영어,"수학:"+수학,"총합:"+총합);
		    System.out.println("영어:"+영어);
		    System.out.println("수학:"+수학);
		    System.out.println("총합:"+총합);
		    }

}
