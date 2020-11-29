package interface18;

//interface MyInter{}//[o]default(package/생략형)접근 지정자 사용
//static interface MyInter{}//[x]클래스와 동일
//final interface MyInter{}//[x]클래스와 다름
//abstract interface MyInter{}//[o]붙여도 되지만 의미없다
//인터페이스들]
interface MyInter1{
	//public MyInter1() {}//[x]생성자를 가질 수없다
	//멤버 상수]
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DOUBLE = Double.MAX_VALUE;//public static final생략
	//추상 메소드들]
	public abstract void noOmit();
	void omit();//public abstract생략된거와 같다
}
interface MyInter2{
	void omit();
	
}
//추상클래스
abstract class AbstractClass implements MyInter1{
	//추상메소드
	//추상클래스안에서 추상 메소드 정의시에는 반드시 abstract키워드를 붙인다
	//	 (단, 인터페이스에서는 생략 가능)
	//void abstractMethod();//[x]
	abstract void abstractMethod();	
}
class MyClass implements MyInter2,MyInter1{

	@Override
	public void noOmit() {}
	
	//protected void omit() {}//[x]접근지정자가 부모와 같거나 부모보다 큰 접근지정자여야한다
	@Override
	public void omit() {}	
}
//인터페이스가 인터페이스 상속받을때]
//extends키워드 사용 / 클래스와 다르게, (콤마)로 구분해서 여러개의 인터페이스 상속 가능
interface MyInter3 extends MyInter1,MyInter2{
	void abstractNewMethod();//자식에서 새롭게 확장한 추상 메소드
}
class LasyClass extends AbstractClass implements MyInter2{
	//MyInter1
	@Override
	public void noOmit() {}
	//MyInter2
	@Override
	public void omit() {}
	//AbstractClass의 추상메소드
	@Override
	void abstractMethod() {}
	
}

public class InterFaceBsic {

	public static void main(String[] args) {
		//1]인터페이스 역시 추상클래스처럼 인스턴화(객체화,메모리생성) 불가
		//MyInter1 mi1 = new MyInter1();//[x]
		//2]이질화: 인터페이스명 인터페이스타입의 인스턴스변수 = new 자식클래스명();
		MyInter1 mi1 = new MyClass();
		mi1.noOmit();
		mi1.omit();
		
		MyInter2 mi2 = new MyClass();
		//mi2.noOmit();//[x]
		((MyInter1)mi2).noOmit();//권장하지 않음[x]
		//noOmit()메소드는 MyInter2입장에서는  MyClass에서 새롭게 확장한 메소드에 해당 그래서 .으로 접근불가
		((MyClass)mi2).noOmit();
		
		MyClass mc = (MyClass)mi2;//[o]
		System.out.println(mc instanceof MyClass);
		System.out.println(mc instanceof MyInter1);
		System.out.println(mc instanceof MyInter2);
		//인터페이스 상수 접근]
		//방법1]인터페이스명.상수
		System.out.println(MyInter1.MAX_INT);		
		System.out.println(MyInter3.MAX_INT);
		//방법2]클래스명.상수
		System.out.println(AbstractClass.MAX_INT);
		System.out.println(MyClass.MAX_INT);
	}
	

}
