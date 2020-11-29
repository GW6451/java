package polymophism14;
/*
 참조형 사이의 형변환(Type Casting)
 
  - 두 클래스 간의 상속관계가 존재할때 형변환이 가능하다
  - 형변환시 타입캐스팅 연산자(자료형)를 사용
  - 부모클래스 -> 자식클래스의 인스턴스에 저장(Down Casting)
  - 자식클래스 -> 부모클래스의 인스턴스 저장(Up Casting)
  
  [업캐스팅]
  	부모의 인스턴스 변수 = 자식의 인스턴스 변수; //[o]
  	
  	
  [다운캐스팅]
  	자식 타입의 인스턴스 변수 = (자식타입)부모의 인스턴스 변수;
  	
  	
 */
class Base{
	void base() {
		System.out.println("Base의 메소드 : base()");
	}
}

class NoDerived{}

class Derived extends Base{
	void derived() {
		System.out.println("Derived의 메소드 : Derived()");
	}

	@Override
	void base() {
		System.out.println("Derived에서 오버라이딩 : base()");
	}
	
}
public class RefTypecasting {

	public static void main(String[] args) {
		
		Base base = new Base();
		base.base();
		Derived derived = new Derived();
		derived.base();//오버라이딩한 메소드
		/* 상속관계가 존재하지 않을때 - 주소대입 연산 및 형변환 불가  */
		NoDerived noDerived = new NoDerived();
		//대입연산 X
		//noDerived = base;[x]
		//base = noDerived;[x]
		//형변환 X
		//noDerived = (NoDerived)base;[x]
		//base = (Base)noDerived;[x]
		/* 두 클래스간 상속관계가 존재시 - 주소 대입 연산 및 형변환 가능  */
		System.out.println("[base인스턴스 변수에 derived인스턴수 변수 대입 전]");
		System.out.println("base가 참조하는 클래스 명 : " + base.getClass().getName());
		System.out.println(base instanceof Derived);//false
		//Derived de = (Derived)base;//실행시 오류
		//주소 대입연산[o]
		base = derived;//[o]업 캐스팅, 암묵적 형변환
		System.out.println("[base인스턴스 변수에 derived인스턴수 변수 대입 후]");
		Derived de = (Derived)base;
		System.out.println("base가 참조하는 클래스 명 : " + base.getClass().getName());//Derived
		System.out.println(base instanceof Derived);//true
		
		base.base();//오버라이딩한 메소드
		//base.derived();//[x]undefined(정의되지 않음)
		/*
		 단, 자식에서 새롭게 정의한 멤버(변수.메소드 등)은 부모타입의 인스턴스변수로는 접근 불가(해결방안:다운캐스팅.강제적 형변환)
		 */
		//방법1]
		((Derived)base).derived();
		//방법2]
		Derived dev = (Derived)base;//다운캐스팅.강제적 형변환
		dev.derived();
		
	}//////main

}/////////class
