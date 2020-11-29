package encapsulation13;
/*
  this : 자기 자신의 클래스를 지칭한다
  		 - 인스턴스형 멤버에 접근할 때 사용하는 키워드(반드시 메소드 안에서 사용)
  		 - this 키워드는 정적 메소드안에서 사용할 수 없다
  		 - 즉 static 안 붙은 인스턴스형 메소드 안에서만 사용 가능
  		 # 지역변수와 멤버변수 구분할 때 주로 사용 
 */
public class ThisReservedWord {
	//this.;[x]항상 인스턴스형 메소드 안에서만 사용 가능
	//[인스턴스형 멤버]
	int instanceVar, anotherInstanceVar;
	void instanceMethod() {
		//this는 인스턴스형 메소드 안에서 사용 가능
		//this.하면 자기자신의 모든 멤버(인스턴스형, 정적)가 뜬다
		System.out.println(this.instanceVar);////[o]
		//정적 멤버도 this키워드로 접근 가능하지만 in a static way로 접근하라고 경고가 나옴
		System.out.println(this.staticVar);//[△]경고. 정적인 방법으로 접근해야함
		System.out.println(ThisReservedWord.staticVar);//[o]경고 안 뜸
		System.out.println(staticVar);//[o]경고 안뜸
	}//////instanceMethod
	//정적멤버]
	static int staticVar;
		
	static void staticMethod() {}
		//this.//[x] 정적 메소드 안에서는 사용 불가
	void initialize(int instanceVar, int another, int staticVar) {
		//#지역변수와 멤버변수가 같은 지역 안에서 사용될때 이름이 같은 경우 지역변수가 우선한다
		// 	매개 변수 = 매개변수; 멤버변수 초기화 안됨
		//instanceVar = instanceVar;
		this.instanceVar = instanceVar;
		this.anotherInstanceVar = another;
		//정적 멤버와 멤버변수
		//this.staticVar = staticVar;
		//ThisReservedWord.staticVar = staticVar;
		this.staticVar = staticVar;
	
	}/////initialize
	
	public static void main(String[] args) {
		//인스턴스화]
		ThisReservedWord reserved = new ThisReservedWord();
		reserved.initialize(100,100,1000);
		System.out.println("[멤버 변수 초기화 후]");
		System.out.println("reserved.instanceVar : "+reserved.instanceVar);
		System.out.println("reserved.anoterInstanceVar : "+reserved.anotherInstanceVar);
		System.out.println("staticVar : "+staticVar);
		

	}/////////main

}//////////////class
