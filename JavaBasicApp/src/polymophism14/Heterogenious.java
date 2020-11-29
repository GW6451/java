package polymophism14;
/*
 * 다형성
 * 1] 오버로딩 - 같은 이름으 ㅣ메소드를 한 클래스안에서 여러개 정의 가능
 * 2] 오버라이딩 - 상속관계에서 부모의 메소드를 리모델링(외관은 그대로)
 * 3] Heterogenious(이질화)
 * 	전제조건 : 두클래스 사이에 상속관계가 존재해야함
 * 			부모 타입 부모타입인스턴스변수
 * 			= new 자식타입의 메모리할당
 * 
 *  부모타입의 인스턴스 변수가 접근할 수 있는범위
 *  1] 부모로부터 상속받는 멤버
 *  2] 자식에서 오버라이딩한 메소드를 
 */
class Person{
	//멤버 변수
	String name;
	//멤버 메소드
	void personMethod() {
		System.out.println("부모의 메소드 : personMethod()");
	}
}
class Student extends Person{
	//멤버 변수
	String stNumber;//자식에서 새롭게 확장한 변수
	//멤버 메소드
	void study() {
		System.out.println("자식에서 새롭게 확장한 메소드 : study()");
	}
	@Override
	void personMethod() {
		System.out.println("자식에서 오버라이딩한 메소드 : personMethod()");
	}
	void personMethod(int num) {
		System.out.println("자식에서 오버로딩한 메소드 : personMethod(int)");
	}
	
}
public class Heterogenious {

	public static void main(String[] args) {
		
		Student st = new Student();//동질화(Homogenious)
		//멤버 변수류
		System.out.println(st.name);
		System.out.println(st.stNumber);
		//멤버 메소드류
		st.personMethod();//오버라이딩
		st.personMethod(10);//오버로딩(새롭게 추가)
		st.study();//새롭게 추가
		//Person타입에 자식타입의 메모리 주소 복사
		Person p = st;//Heterogenious 이질화
		//멤버 변수류
		System.out.println(p.name);
		//멤버 메소드류
		p.personMethod();//오버라이딩
		
		Person p2 = new Student();
		System.out.println(p2.name);
		p2.personMethod();
		//방법1] 형변환 후 바로 접근
		System.out.println(((Student)p2).stNumber);
		((Student)p2).personMethod(10);//오버라이딩
		//방법2] 자식 타입의 인스턴스 변수에 담아서 그 변수로 접근
		Student s = (Student)p2;
		System.out.println(s.stNumber);
		s.personMethod(10);
		
	}/////main

}//////class
 