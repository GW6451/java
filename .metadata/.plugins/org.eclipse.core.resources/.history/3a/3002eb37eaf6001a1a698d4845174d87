package abstraction06;
/*
 * .java.파일에 여러개의 class를 정의할때는 main메소드가 있는 클래스 public을 붙여라
 * 그외 클래스는 public생략
 * 원칙은 .java파일당 내가 정의 한 클래스 하나 선언
 */
class Student{
	//멤버 변수]
	//멤버 변수의 데이터 타입을 Person타입 사용: 상속 아님
	Person person;
	Person another = new Person();//선언과 동시에 메모리 할당.
	String stNumber; //학번 속성
	//[멤버 메소드]
	void study() {
		System.out.println(person.name+"가(이) 공부하다");
	}
	//프로그램 효율성을 위한 멤버 메소드]
	void printStudent() {
		person.printPerson();//참조할 메모리가 없기 때문에 참조할 수 없음 
		System.out.println("학번 : "+ stNumber);
	}
}///Student

public class StudentApp {

	public static void main(String[] args) {
		//Student타입의 메모리생성
		//Student타입 객체화
		//Student타입 인스터스화
		Student student1=new Student();
		System.out.println("student1 : "+ student1);
		
		//student1.person이 null임으로 즉 Person타입의 메모리를 가리키고 있지 않음으로(참조하지 않음으로
		//NullPointerExceptiond예외 발생
		//student1.printStudent();//실행시 에러
		System.out.println("student1.person:"+student1.person);
		//해결방법1]Person타입의 메모리 생성해서 주소 대입
		/*
		student1.person = new Person();
		System.out.println("student1.person(주소저장후):"+student1.person);
		student1.printStudent();
		//초기화
		student1.person.name = "가길동";
		student1.person.age = 20;
		student1.person.weight = 99;
		System.out.println("[Person초기화 후]");
		student1.printStudent();*/
		//해결방법2] another의 주소값을 person에 대입
		student1.person = student1.another;
		System.out.println("student1.person: " +student1.person);
		System.out.println("student1.another: " + student1.another);
		//초기화
		student1.person.name = "나길동";
		student1.person.age = 40;
		student1.another.weight = 60;
		student1.stNumber = "2020학번";
		System.out.println("[초기화 후]");
		student1.printStudent();

	}////////main

}///////////class
