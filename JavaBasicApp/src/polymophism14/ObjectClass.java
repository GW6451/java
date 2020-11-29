package polymophism14;
/*
- 자바의 모든 클래스의 최상위 부모는 Object클래스이다
- Object클래스의 equals()메소드는 
 */

class MyClass{
	//멤버변수
	int data;
	//인자 생성자
	public MyClass (int data) {
		this.data = data;
	}
	//실제 저장된 데이타가 반환되도록 Object로부터 상속받은 toStirng()메소드 오버라이팅(재정의)
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	@Override
	public int hashCode() {
		return data;
	}
	//실제 저장된 데이터를 비교하도록 equals(Object)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof MyClass) {
			MyClass mc = (MyClass)obj;
			if(mc.data == this.data) return true;
			else return false;
		}
			return false;//MyClass가 아닌경우
	}
}
class Point{
	//멤버 변수]
	int x,y;
	//인자 생성]
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//문1] "x=10, y=20"처럼 반환 하도록 toString()메소드를 오버라이딩 하여라
	public String toString() {
		return String.format("x = %s, y = %s ", x, y);
		
	}
	//문2] x좌표와 y좌표가 같은지 비교하도록 equals()메소드를 오버라이딩하여라
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pt = (Point)obj;
			if(pt.x == x && pt.y==y) return true;
			else return false;
		}
		return false;
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		//인스턴스화
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(100);
		System.out.println("[두 객체의 toString() 호출");
		System.out.println(mc1.toString());
		System.out.println(mc1.getClass().getName()+'@'+Integer.toHexString(mc1.hashCode()));
		System.out.println(mc2.toString());
		System.out.println(mc2.getClass().getName()+'@'+Integer.toHexString(mc2.hashCode()));
		System.out.println("[두 객체를 equals() 메소드로 주소 비교]");
		System.out.println(mc1.equals(mc2)?"같다":"다르다");
		
		Point point1 = new Point(10,20);
		Point point2 = new Point(10,20);
		System.out.println("[toString[]호출]");
		System.out.println(point1);
		System.out.println(point2);
		System.out.println("[equals()호출]");
		System.out.println(point1.equals(point2));
		
	}///////main

}/////////class
