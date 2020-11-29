package constructor15;
/*
 1]생성자 : 객체가 생성될 때(인스턴스화) 최초로 실행되는 메소드를 의미
 2]생성자 특징
 	- 생성자 이름은 클래스명과 동일해야한다
 	- 반환 타입을 가져선 안된다
 	- 생성자의 접근지정자로는 주로 public속성
 3]생성자의 역할
 	- 멤버 변수를 초기화하는 일
 	- 생성자를 구현하지 않았을 경우 컴파일러는 default(기본)생성자를 제공해줌
 	- 인자 생성자를 하나라도 정의했다면 그때는 컴파일러가 default(기본)생성자를 제공해주지 않는다##중요!
 	- 생성자를 다양하게 오버로딩함으로써 다양한 초기값을 부여할 수 있다
 */
//Saram이라는 클래스
class Saram{//초기화용 메소드로 멤버변수 초기화
	String name;
	String lastJumin;
	//Saram이라는 기본생성자
	public Saram() {
		
	}
	//멤버변수 초기화용 메소드] 반환타입 void 반환하지 않겠다
	void initialize(String name, String lastJumin) {
		this.name = name;
		this.lastJumin = lastJumin;
	}
	void print() {
		System.out.println(String.format("%s는 %s입니다", 
				name, lastJumin.charAt(0)=='1'?"남자":"여자"));
	}	
	
}
class Saram2{
	String name;
	String lastJumin;
	
	
	//기본 생성자
	public Saram2() {
		name = "기본값";
		lastJumin = "234567";
	}
	
	//인자생성자
	public Saram2(String name) {
		this.name = name;
		this.lastJumin = "1234567";
	}
	
	//인자생성자2
	public Saram2(String name, String lastJumin) {
		this.name = name;
		this.lastJumin = lastJumin;
	}
	void print() {
		System.out.println(String.format("%s는 %s입니다", 
				name, lastJumin.charAt(0)=='1'?"남자":"여자"));
	}	
}
public class Constructor01 {

	public static void main(String[] args) {
		//Saram 인스턴스화/객체화/메모리 생성]
		Saram saram = new Saram();
		//초기화용 메소드 initialize()로 초기화 호출하지 않으면 - NullPointerException발생
		//saram.print();
		saram.initialize("가길동", "123456");
		saram.print();
		
		//Saram2 인스턴스화/객체화/메모리 생성]
		//기본생성자로 객체 생성
		Saram2 saram2_1 = new Saram2();
		saram2_1.print();
		
		Saram2 saram2_2 = new Saram2("나길동");
		saram2_2.print();
		
		Saram2 saram2_3 = new Saram2("다길동","1234");
		saram2_3.print();

	}///main

}////class