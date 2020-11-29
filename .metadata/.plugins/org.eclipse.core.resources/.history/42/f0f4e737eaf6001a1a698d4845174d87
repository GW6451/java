package abstraction06;
/*
 [클래스 정의]
 -클래스명은 항상 대문자로 시작
 -클래스는 객체의 설계도
 -클래스는 여러타입의 값을 저장할 수 있는 자료형(자료구조)
  즉 사용자 정의 자료형(데이터 타입)이다
 -인간세계
 
 
 
 [클래스 정의 구문]
 접근지정자 [modifier(지정자)] class 클래스명{
 		//클래스의 멤버들
 		 멤버 상수
 		 멤버 변수
 		 멤버 메소드
 		 클래스(내부 클래스)
 		 인터페이스
 }
 */
/*속성[멤버 변수]
 * 멤버 변수는 해당 클래스와 has a 관계가 존재해야 한다
 * 
 * 멤버 변수는 초기화를 하지 않으면 해당 자료형으로 초기화 된다
     예] 참조형 : null, int:0 , double:0.0, boolean:false 등
 * 멤버 변수는 해당 클래스안의 모든 메소드에서 사용 가능
 
 
 멤버 변수 선언]
 접근 지정자 [modifier]자료형 멤버변수명
 **멤버변수는 모든 데이터 타입
  (기본 데이터 타입/배열/클래스 등)을 사용할 수 있다
  
  단, 지역변수 선언시에는 [modifier] 자료형 변수명; 
 */

//사람을 추상화해보자 - 사람이라는 객체를 가지고 설계도를 만들어보자
//즉 사람의 행동과 속성 뽑아내서 행동은 메소드로 속성은 상수나 멤버변수로
public class Person {
	//[멤버 변수 선언]
	//1] 사람이라는 객체가 갖고 있는 속성(성질이나 상태) : 멤버 변수
	// has a 관계
	public String name;//이름 속성 - public - 접근 지정자 사용
	int age = 1; // 나이 속성 - 생략형(패키지) 접근지정자 사용 / 선언과 동시에 초기화
	double weight;//몸무게 속성 - 생략형 접근지정자 사용
	//[멤버 메소드 정의]
	void sleep() {
		System.out.println(name+"가(이) 자다");
	}
	void eat() {
		System.out.printf("나이가 %d살인 %s가(이) 먹다%n 그래서 몸무게가 %.2fkg이다%n", age, name, weight);
	}
	//프로그램 효율성을 위한 메소드들]
	public String getPerson() {
		return "["+name+"의 정보]\r\n나이 :" +age+"\r\n몸무게:" + weight;
		
	}////////////getPerson
	void printPerson() {
		System.out.println(getPerson());
	}

}/////class
