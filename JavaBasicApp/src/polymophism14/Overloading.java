package polymophism14;

import java.util.Date;

/*
1] 오버로딩(Overloading)-중복정의
   하나의 클래스 안에서 적용되는 개념으로 같은 
           이름의 메서드를 여러개 정의 할 수 있다
   - 메소드명이 동일해야 한다.
   - 매개변수의 데이터 타입이 다르거나
   - 매개변수의 갯수가 다르거나 
      매개변수의 타입이 다른 경우 순서가 다른 경우도 오버로딩이다	    
   - 메소드의 반환타입은 상관이 없다.	
*/
public class Overloading {
	//아래 두 메소드는 같은 메소드임 오버로딩이 아님
	//메소드명 동일, 매개변수 타입 및 개수 및 순서가 동일하기 때문에 같은 메소드로 본다 즉, 오버로딩이 아니다
	
	//int noOverloading(String str, Date date) {return -1;}//[x]
	//float noOverloading(String str2, Date date2) {return -1;}//[x]
	//1]매개변수 타입이 다른 경우-양념의 종류가 다른 경우
	void paramTypeDiff(int param) {}
	void paramTypeDiff(float param) {}
	void paramTypeDiff(double param) {}
	//2]매개변수 갯수가 다른 경우-양념을 넣는 횟수가 다른 경우
	void paramCountDiff() {}
	void paramCountDiff(int param) {}
	void paramCountDiff(int param, int param2) {}
	void paramCountDiff(int param, int param2, int param3) {}
	//3]매개변수 타입이 같고 개수도 같지만 순서가 다른 경우 - 양념은 같은데 넣는 순서가 다름
	void paramOrderDiff(int args1, float args2, double args3) {}
	void paramOrderDiff(float args2, int args1, double args3) {}
	void paramOrderDiff(float args2, double args3, int args1) {}
	//VarArgs기능 미사용시 여러개 메소드 Overloading해야함
	/*
	 JDK 5.0이상부터 
	 */
	/*static int getTotal(int param) {
		int total = 0;
		total += param;
		return total;
	}
	static int getTotal(int param, int param2) {
		int total = 0;
		total += param+param2;
		return total;
	}
	static int getTotal(int param, int param2, int param3) {
		int total = 0;
		total += param+param2+param3;
		return total;
	}*/
	static int getTotal(int ... param) {
		int total = 0;
		for(int i=0; i<param.length;i++) total += param[i];
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(getTotal(10));
		System.out.println(getTotal(10,20));
		System.out.println(getTotal(10,20,30));
		System.out.println(getTotal(10,20,30,40));
		System.out.println(getTotal(1,2,3,4,5,6,7,8,9,10));

	}

}
