package accessmodifier07;

	/*
	 접근지정자 : 클래스와 클래스 사이  혹은 클래스의 멤버간의 접근을 제어하는 기능을 가진 한정자
	 private < default(package) < protected < public
	 
	  private : 자기 클래스 안에서만 접근가능. 다른 클래스에서 접근 불가능
	  package : 같은 패키지 내에 있는 클래스들끼리 접근 가능
	  public : 모든 클래스에서 접근가능
접근 지정자를 붙일 수 있는 곳 : 클래스 앞, 클래스 멤버
결론 : 인터페이스와 클래스와 클래스의 모든 멤버에는 접근지정자를 붙일 수 있다
	 */
//private class PrivateClass{}//[x]
class PackageClass{}//[o]
public class AccessModifierOne {
	//멤버변수]
	public int publicVar;
	int packageVar;
	private int privateVar;
	//멤버메소드]
	public void publicMethod() {

	}
	void packageMethod() {}
	private void privateMethod() {
		System.out.println("privateVar:" + privateVar);
	}


}///////class
