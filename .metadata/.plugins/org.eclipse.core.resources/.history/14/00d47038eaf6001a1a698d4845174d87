package constructor15;

class Person1 {//초기화용 메소드로 멤버변수 초기화
	String name;
	String lastNo;
	//멤버변수 초기화용 메소드]
	void initialize (String name, String lastNo) {
		this.name = name;
		this.lastNo = lastNo;
		//출력
	}
	void print() {
		System.out.println(String.format("%s는 %s입니다", name, lastNo.charAt(0)=='1'?"남자":"여자"));
	}
}

class Person2 {
	String name;
	String lastNo;
	//기본 생성자
	public Person2(){
		name = "가길동";
		lastNo = "123456";
	}
	//인자생성자1
	public Person2(String name) {
		this.name = name;
		lastNo = "234567";
	}
	public Person2(String name, String lastNo) {
		this.name = name;
		this.lastNo = lastNo;
	}
	void print() {
		System.out.println(String.format("%s는 %s입니다", 
				name, lastNo.charAt(0)=='1'?"남자":"여자"));
	}
	
}

public class PracticePerson {
	
	public static void main(String[] args) {
		Person1 person1 = new Person1();
		person1.initialize("가길동", "13456");
		person1.print();
		
		Person2 person2_1 = new Person2();
		person2_1.print();
		
		Person2 person2_2 = new Person2("나길동");
		person2_2.print();
		
		Person2 person2_3 = new Person2("다길동","123456");
		person2_3.print();
	}
	
}
