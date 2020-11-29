package modifier09;

public class StaticExample {
	//멤버변수]
	static String staticvar;
	int a;
	
	public static void sleep() {
		System.out.println("잤다");
	}
	public String eat(String name, String food) {
		return String.format("%s가 %s를 먹었다", name,food);
	}
}
