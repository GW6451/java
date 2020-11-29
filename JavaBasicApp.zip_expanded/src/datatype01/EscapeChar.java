package datatype01;

public class EscapeChar {
	/*
	 Escape문자:특정 형식에 맞게 출력하기 위해 사용하는 문자로 특정문자 앞에\을 붙이면
	 그 특정문자는 어떤 특수한 기능을 함
	 이스케이프 문자는 모든 ""안에서 사용할 수 있다
	 에] "HitHomeRun" =>여기서 t는 일반문자를 의미
	    "Hi\tHomeRun"=>여기서 t는 \와 결합해서 탭만큼 띄어쓰는 기능을 하는 이스케이프 문자가 됨
	*/

	public static void main(String[] args) {
		System.out.println("Hit HomeRun");
		System.out.println("Hi\t HomeRun");//여기서 ln은 줄바꿈 기능
		//1]\n:줄바꿈(line feed)기능
		System.out.print("Welcome To Java!\n");
		System.out.print("Hi Java!");
		System.out.print("\nLet's Do It.\nGo Fighting!!!\n");
		//2]\r:커서를 해당 줄에서 맨 처음으로(carrige return)
		System.out.println("My Nickname is Superman\rXX");//이클립스는 줄바꿈으로 적용되는데 cmd에서 확인하면 MY=>XX
		/*
		 * 키보드의 A라고 치면 65(A의 아스키코드값)라는 값이 저장됨
		 * 키보드로 엔터를 치면 13과 10이 저장됨
		 * 13은 \r의 아스키 코드값
		 * 10은 \n의 아스키 코드값
		 * 고로 엔터키는 \r\n이다
		 */
		//3]\t:탭키 만큼 띄어쓰기 기능
		System.out.println("국어t영어t수학");
		System.out.println("국어\t영어\t수학");
		//4]\':single quotation 표시
		//문자열을 '(싱글퀘테이션)으로 감싸도 되는 곳에서 의미있다
		System.out.println("나의 닉네임은 \'스마트보이\'입니다");
		//5**]\":double quotation표시
		//	"을 문자열의 시작/끝을 의미하는 문자가 아님을 컴파일러에게 알려줌(중요)
		System.out.println("나의 닉네임은 \"스마트보이\" 입니다");
		
		//6]\\:뒤에 \은 이스케이프 문자 역할을 하는 특수문자가 아니라는 것을 컴파일러에게 알려주는 기능
		System.out.println("D:\nDrive\table");
		System.out.println("D:\\nDrive\\table");
		/*
		 Format String:출력형식(내가 원하는대로)을 지정하기 위한 형식 문자열
		 ""안에 %s나 %d등의 변환 지시어(Conversion Specifier)를 사용해서 원하는 출력 형식을 만들 수 있다.
		 **변환지시어를 쓸 수는 메소드가 정해져 있다
		 */		
		/*
		 주요 변환 지시어]
		 %d : 정수값 출력시(byte/short/int/long)
		 %f : 실수값 출력시(float/double)
		 %c : 한 문자 출력시(char)
		 %b : boolean형 출력시
		 %s : 문자열 출력시(string)
		 %n : 줄바꿈(\r\n도 가능)
		 %% : %리터럴을 의미(일반 %를 의미)
		 */
		int kor=99, eng=80, math=96;
		double avg=(kor+eng+math)/3.0;
		System.out.println("[형식 문자열 미 사용]%s");
		System.out.println("국어:"+kor+",영어:"+eng+",수학:"+math+",평균:"+avg);
		//printf("형식문자열", 값들을 콤마로 구분해서 나열)
		//단, printf는 줄바꿈 기능이 없다
		System.out.println("[형식 문자열 사용]");
		System.out.printf("국어:%-3d\t영어:%d\t수학:%d\t평균:%f\r\n",kor,eng,math,avg);
		System.out.println("아무거나");
		/*
		 형식문자열에서 데이터 출력시 자릿수 지정
		 예] %숫자d
		 
		 %4c : 한 문자를 출력하는 데 전체 자리수는 4
		 %5d : 정수 숫자를 출력하는데 전체 자리수는 5
		 %6.2f% : 실수를 출력하는 데 소수점 둘째자리까지만 출력하고 전체 자리수는 6(소수점 포함)
		 			자릿수 지정시 값을 오른쪽부터 채운다(양수일때)
		 			-를 붙이면 왼쪽부터 채운다
		 */
		System.out.println("[출력 자리수 미 지정]");
		System.out.printf("국어:%d,영어:%d,수학:%d,평균:%f%n",kor,eng,math,avg);
		System.out.println("[출력 자리수 지정(양수)]");
		System.out.printf("국어:%4d,영어:%4d,수학:%4d,평균:%7.2f%n",kor,eng,math,avg);
		System.out.println("[출력 자리수 지정(음수)]");
		System.out.printf("국어:%-4d,영어:%-4d,수학:%-4d,평균:%.2f%n",kor,eng,math,avg);
		//기타]
		System.out.printf("%c %b %.2f %s%n",'가',false,3.145678,"문자열");
		//모든 값을 %s로 출력해도 된다
		
		System.out.println("============================");
		System.out.printf("%25s%n","자바반 성적표");
		System.out.println("============================");
		System.out.printf("%-10s%-12s%s%n","KOREA","ENGLISH","MATH");
		System.out.println("============================");
		System.out.printf("%-10s%-12s%s%n",100,99,78);
		System.out.printf("%-10s%-12s%s%n",kor,eng,math);
		System.out.println("============================");
	}

}
