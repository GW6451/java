package AcademyPractice;

public class Student extends Person{
	//멤버변수]
	String stNumber;
	//인자 생성자]
	public Student(String name, int age, String stNumber) {
		super(name,age);
		this.stNumber = stNumber;
	}
	//멤버 메소드]
	public String get() {
		return String.format("%s, 학번 : %s", super.get(), stNumber);
	}
	public void print() {
		System.out.println(get());
	}

}
