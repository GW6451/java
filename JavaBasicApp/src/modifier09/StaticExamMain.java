package modifier09;

public class StaticExamMain {

	public static void main(String[] args) {
		StaticExam.name = "강아지";
		StaticExam.like(StaticExam.name);
		
		StaticExam exam = new StaticExam();
		exam.age = 27;
		System.out.println("내 10년 후 나이는 "+exam.after(10)+"이다.");
	}
	//static은 메모리를 따로 할당하지 않아도 자동으로 할당이 된다
}
