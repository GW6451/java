package operator02;

public class NolliOP {

	public static void main(String[] args) {
		/*
		 -논리연산자(이항연산자)의 결과값은 true,false이다.
		 && : and연산자(논리곱) 두 항이 참일때만 참이다(~그리고)
		 || : or연산자(논리합) 두 항 중의 하나라도 참이면 참(~또는, 혹은)
		 !(단항연산자): not연산자(논리부정) 단항이 참이면 거짓, 거짓이면 참이다(~아니다)
		 ^(이항연산자):xor연산자(배타) 두 항이 서로 배타적일때(다를때) 참, 두 항이 서로 같으면 거짓
		 -논리연산자의 우선순위 :!>&&>||,^
		 -&&와 &, ||와 |는 둘다 결과값이 같다
		 -&&는 첫째항이 거짓이면 두번째항은 계산안한다
		 -&는 첫째항이 거짓이더라도 두번째항을 계산한다
		 -산술 > 비교 > 논리연산자 순으로 우선 순위가 적용됨
		 */
		int num1=15, num2 =10;
		boolean b = num1 >= num2 && num1 == num2;
		System.out.printf("%d >= %d && %d == %d의 결과: %b%n",num1,num2,num1,num2,b);
		b = true || false;
		System.out.printf("%b || %b의 결과:%b%n",true,false,b);
		//논리연산자(&&,||,!,^)의 각 항에는 반드시 true나 false값을 갖는 식(비교식)이거나 true, false 값이어야한다.
		//b= num1 + num2 && num1 != num2;
		b= num1 <= num2 ^ num1 != num2;
		System.out.printf("%d <= %d ^ %d != %d의 결과:%b%n",num1,num2,num1,num2,b);
		
		b= !(num1 != num2) || num1 >= num2 && num1 == num2;
		System.out.println("b="+b);
		
		b= 10 % 3 > 6-2*2 && 10 <= 6*2 || 5*3 != 10;
		System.out.println("b="+b);
		
		b = !true || true ^ false && true;
		System.out.println("b="+b);
		//&&와 &, ||와 |
		
		/*Ref ref = new Ref();
		System.out.println(ref.data);*///100
		Ref ref = null;
		//System.out.println(ref.data ==100);[x]
		//System.out.println(ref.data);
		System.out.println("[&&연산자 사용]");
		System.out.println(ref != null && ref.data ==100);
		//아래는 오른쪽항이 실행이 되서 에러
		
		//System.out.println("[&연산자 사용]");
		//System.out.println(ref != null & ref.data ==100);
	}

}

class Ref{
	 
	int data =100;
	
}

