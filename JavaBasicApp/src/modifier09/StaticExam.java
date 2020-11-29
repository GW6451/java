package modifier09;

public class StaticExam {
	static String name;
	int age;
	public static void like(String name) {
		System.out.println(String.format("나는 %s를 좋아한다", name));
	}
	public int after(int afteryear) {
		afteryear = this.age + 10; 
		return afteryear;
	}
}
