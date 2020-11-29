package operator02;

public class BitOP {

	public static void main(String[] args) {
	//비트 연산은 비트 단위로 계산
	/*
	 [쉬프트(Shift)연산자(이항연산자)]
	 -두 항이 반드시 정수여야한다
	  정수 << 비트수 : 왼쪽으로 비트수만큼 이동하고
	   			   오른쪽에 남은 비트는 0으로 채운다
	  정수 >> 비트수 : 오른쪽으로 비트수만큼 이동하고
	        	   왼쪽에 남은 비트는 부호비트로 채운다(1:음수,0:양수)
	 */
	byte b1 = 10, bit1 =2;
	
	//byte b2= b1 << bit1;//<< : 연산
	/*
	
	
	
	 */
	int result = b1 << bit1;
	System.out.printf("%d << %d의 결과 : %d%n",b1,bit1,result);
	
	result = b1 >> bit1;
	System.out.printf("%d >> %d의 결과 : %d%n",b1,bit1,result);
	
	b1 = -9;
	result = b1 << bit1;
	System.out.printf("%d << %d의 결과 : %d%n",b1,bit1,result);
	result = b1 >> bit1;
	System.out.printf("%d >> %d의 결과 : %d%n",b1,bit1,result);
	
	b1 = 3;
	byte b2 = -15;
	/*
	 * 3:0000 0011
	 * ^
	 * -15:1111 0001
	 * --------------
	 *     0000 0001
	 */
	System.out.println("논리연산자:"+(true& 10>100));
	System.out.println("비트연산자:"+(3 & -15));
	System.out.printf("%d & %d의 결과 : %d%n", b1,b2,b1&b2);
	System.out.printf("%d | %d의 결과 : %d%n", b1,b2,b1 | b2);
	System.out.printf("%d ^ %d의 결과 : %d%n", b1,b2,b1 ^ b2);
	System.out.printf("~%d ^ %d의 결과 : %d%n",b2,b1, ~b2);


	
	
	}

}
