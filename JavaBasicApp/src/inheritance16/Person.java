package inheritance16;
/*
클래스 상속 :
- 단일 상속자만 지원(클래스 하나만 상속 가능)
- IS A 관계 성립해야한다  -->  자식 IS A부모
- extends 키워드 사용
- private 접근 지정자가 붙은 부모의 멤버는 상속은 받으나 접근 불가
 
- 형식]

	접근지정자[지정자] class 자식 클래스명  extends 부모클래스명 {
	
	}
*/
public class Person /*extends Object*/{//모든 클래스는 Object를 자동으로 상속 받는다
	//멤버변수]
	String name;
	int age;
	String address;
	//기본생성자]	
	public Person() {
		//super();//부모클래스의 생성자 -- Object의 기본생성자(인자가 없기 때문)
		System.out.println("Person의 기본 생성자");
				
	}
	//멤버 메소드]
	//
	String getPerson() {
		return String.format("이름 : %s, 나이 : %s, 주소 : %s",name,age,address);
	}
	void printPerson() {
		System.out.println(getPerson());
	}
}//////////class
