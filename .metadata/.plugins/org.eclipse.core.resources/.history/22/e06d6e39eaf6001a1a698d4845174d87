package stringclass11;

class AClass{}
class BClass{}

public class StringBasic {

	public static void main(String[] args) {
		/*
		 [값(데이터) 비교]
		 기본 자료형에서 ==는 실제 저장된 값
		 비교하는 비교연산자
		 참조형에서 ==는 주소 비교
		 (단, 같은 클래스 타입끼리만 비교 가능)
		 */
		int num1 = 10, num2 = 20;
		String strResult =num1 == num2? "값이 같다": "값이 다르다" ;
		System.out.println(strResult);
		//인스턴스화
		AClass ac = new AClass();
		BClass bc = new BClass();
		//strResult =  ac == bc? "주소가 같다": "주소가 다르다" ;//[x]타입이 다르므로 주소 비교 불가
		AClass ac2 = new AClass();
		strResult =  ac == ac2? "주소가 같다": "주소가 다르다" ;//[o]
		System.out.println(strResult);
		System.out.println("ac = "+ac+", ac2 = "+ac2);
		ac = ac2;
		System.out.println("[주소 대입후]");
		strResult =  ac == ac2? "주소가 같다": "주소가 다르다" ;//[o]
		System.out.println(strResult);
		System.out.println("ac = "+ac+", ac2 = "+ac2);
		//ac = bc;//[x]타입이 다름으로 대입연산도 불가
		//				단, 타입이 달라도 두 클래스간의 상속관계가 존재하면 대입 및 형변환 가능
		//타입이 다르더라도 주소 비교가능-equals()메소드사용
		//결론-참조형의 주소 비교시에는  ==보다는 equals사용
		strResult=ac.equals(bc)? "주소가 같다 " : "주소가 다르다";
		System.out.println(strResult);
		System.out.println("ac=" + ac + "bc=" + bc.toString());
		
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println("[new 연산자 사용]");
		System.out.println("==로 주소 비교 : "+(str1 == str2));
		//String클래스의 equals()메소드(Object로 부터 상속받은 메소드)
		//실제 저장된 문자열을 비교하도록 오버라이딩됨
		System.out.println("equals()로 주소 비교 : "+(str1.equalsIgnoreCase(str2)));
		//String클래스는 프로그래밍에서 기본 자료형처럼 워낙 많이 쓰기 때문에 new 연산자로 메모리를 할당 안하고 바로 = "문자열" 대입이 가능
		
		//World
		String str3 ="WORLD";
		String str4 ="WORLD";
		System.out.println("[new 연산자 미사용]");
		System.out.println("==로 주소 비교 : "+(str3 == str4));
		System.out.println("equals()로 주소 비교 : "+(str3.equalsIgnoreCase(str4)));
		
		/*
		 #String클래스에서 실제 저장된 문자열 비교시에는  equals()메소드 사용(==는 안됨)
		 
		 String클래스에서 Object클래스의 equals()메소드를 주소값 비교가 아니라 실제 저장된 문자열 값을 비교하도록 오버라이딩 해놓음
		 #Object클래스의 equals()메소드느 원래 두 객체 간의 주소 비교를 하는 메소드임
		 */
		String str5 = "Hello";
		String str6 = "HELLO";
		System.out.println("==로 주소 비교 : "+(str5 == str6));
		System.out.println("equals()로 문자열 비교 : "+(str5.equalsIgnoreCase(str6)));
		System.out.println("equals()로 문자열 비교 : "+(str5.equalsIgnoreCase(str6)));
		
		/*
		 역시 Wrapper클래스처럼 String클래스에서도 Object클래스의 toString()메소드를 메모리주소가 아닌
		 실제 저장된 문자열을 반환하도록 오버라이딩 해 놓음
		 */
		String str7 = new String("자바");
		System.out.println("str7="+str7);
		System.out.println("str7.toString()="+str7.toString());
	}//////main

}/////////class
