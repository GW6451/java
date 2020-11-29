package modifier09;

public class StaticExampleMain {

	public static void main(String[] args) {
		StaticExample.staticvar = "dog";
		System.out.println(StaticExample.staticvar);
		StaticExample.sleep();
		
		StaticExample example = new StaticExample();
		example.a = 10;
		System.out.println(example.eat("star","zerocola"));
	}
}
