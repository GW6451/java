package inheritance16;

public class PersonApp {

	public static void main(String[] args) {
		/* 생성자 호출 순서 : 부모생성자 -> 자식 생성자  */
		System.out.println("[기본 생성자로 객체 생성 : Student]");
		Student student1 = new Student();
		student1.printStudent();
		//인스턴스 변수로 접근해서 멤버 초기화
		student1.name = "김유경";
		student1.age = 27;
		student1.address = "개봉동";
		student1.stNumber = "2013학번";
		student1.printStudent();
		student1.study();
		System.out.println();
		System.out.println();
		System.out.println("[인자 생성자로 객체 생성 : Student]");
		Student student2 = new Student("김은혜", 28,"고잔동","2013학번");
		System.out.println(student2.getStudent());
		student2.study();
		/*
		 인자생성자를 정의해서 더이상 기본생성자를 제공해주지 않으므로 기본생성자로 객체생성하려면 기본생성자를 직접 정의해줘야한다
		 */
		//Teacher teacher = new Teacher();//[x]undefined
		Teacher teacher = new Teacher("김유경",30,"인천","자바");
		teacher.printTeacher();
		teacher.teach();
	}/////////main

}//////////////class
