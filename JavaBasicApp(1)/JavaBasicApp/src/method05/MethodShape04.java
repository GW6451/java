package method05;

import java.util.Scanner;

//메소드 형식 4:매개변수도 있고 반환값도 있는 경우
/*
접근지정자 [modifier] 반환타입 메소드명(매개변수들){

	처리할 일;
	return 결과값;   
} 
가장 활용빈도가 높은 메소드 타입]  
*/
public class MethodShape04 {
	/*
	  * 인원수를 매개변수로 전달받아
	  * 인원수만큼 나이를 사용자로부터 입력받고
	  * 그 나이의 평균을 반환하는 메소드 정의 
	  */
	//1]메소드 정의
	static int getAverageOfAge(int personCount) {
		Scanner sc = new Scanner(System.in);
		int total=0;
		for(int i=0;i < personCount;i++) {
			System.out.println(i+1+"번째 나이 입력?");
			total+= sc.nextInt();
		}
		return total/personCount;
	}/////////////getAverageOfAge
	/*문]매개변수로 두 숫자와 연산자(+,-,*,/)를
	전달 받아서 그 결과값을 반환하는 메소드를 정의해라
	그리고 main메소드에서 호출하여 
	그 결과값을 확인 하여라.반환타입은 int형*/
	static int getCalc(int fnum,int snum,char op) {
		switch(op) {
			case '+':return fnum+snum;
			case '-':return fnum-snum;
			case '*':return fnum*snum;
			case '/':return fnum/snum;
			default:return -2147483648;
		}
	}
	/*
	 * 문]여러개의 숫자를 입력받아서 그 중에
	 *    최대값을 구하는 메소드를 정의하자
	 *    단, 숫자의 개수는 매개변수로 전달받고
	 *    숫자의 개수 만큼 사용자로부터 숫자를
	 *    입력(Scanner)받아 최대값을 구해 
	 *    그 최대값을 반환하는 메소드이다.
	 *    그리고 main에서 호출하여 최대값을
	 *    출력하여라. 	
	 */
	static int getMaxValue(int numberCount) {
		Scanner sc = new Scanner(System.in);
		//최대값을 저장할 변수
		int max =0;
		//[배열 미 사용]
		//numberCount만큼 반복하면서 숫자 입력받기
		/*
		for(int i=0; i < numberCount;i++) {
			System.out.println(i+1+"번째 숫자 입력?");
			//최초 입력값을 max에 저장
			if(i==0) max=sc.nextInt();
			else {
				int inputNumber=sc.nextInt();
				if(max  < inputNumber) max = inputNumber;
			}
		}
		*/
		//[배열 사용]
		int[] array = new int[numberCount];
		//numberCount만큼 반복하면서 숫자 입력받기
		for(int i=0;i < array.length;i++) {
			System.out.println(i+1+"번째 숫자 입력?");
			array[i]=sc.nextInt();
			if(i==0) max = array[0];
			else {
				if(max < array[i]) max=array[i];
			}
			
		}		
		return max;
	}
	public static void main(String[] args) {
		//2]메소드 호출
		//System.out.println("3명의 나이 평균:"+getAverageOfAge(3));
		int rt_value = getCalc(10, 10, '@');
		if(rt_value==-2147483648)
			System.out.println("잘못된 연산자 기호입니다");
		else
			System.out.println("연산 결과는 "+rt_value);
		
		System.out.println("최대값:"+getMaxValue(3));
	}////////main

}///////////class
