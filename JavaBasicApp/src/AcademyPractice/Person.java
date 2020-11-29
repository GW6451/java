package AcademyPractice;

public class Person {
	//멤버변수]
	String name;
	int age;
	//기본생성자]
	public Person() {}
	//인자생성자]
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//멤버 메소드]
	public String get() {
		return String.format("이름 : %s, 나이 : %s",name,age);
	}
	//출력 메소드]
	public void print() {
		System.out.println(get());
	}
	
}////////////class
