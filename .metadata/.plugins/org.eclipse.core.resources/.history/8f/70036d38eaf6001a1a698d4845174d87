package constructor15;

public class Constructor02 {

	public static void main(String[] args) {
		//기본생성자로 객체 생성
		Person person1 = new Person();
		System.out.println("[초기화용 메소드 initialize()호출 전]");
		person1.print();
		System.out.println();
		System.out.println("[초기화용 메소드 initialize()호출 후]");
		person1.initialize("가길동", 20, "가산동");
		person1.print();
		System.out.println();
		//인자 생성자로 객체 생성]
		//생성자가 동시에  멤버 변수 초기화 됨
		//개발자가 정의한 초기화용 메소드 호출 불필요
		System.out.println("[이름만 전달]");
		Person person2 = new Person("나길동");
		person2.print();
		System.out.println();
		System.out.println("[이름과 나이 전달]");
		Person person3 = new Person("다길동",20);
		person3.print();
		System.out.println();
		System.out.println("[이름과 나이와 주소 전달]");
		Person person4 = new Person("라길동",30,"가산동");
		person4.print();

	}////main

}////////class
