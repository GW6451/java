package constructor15;
/*
 this()메소드
 - 자기 자신의 생성자를 의미
 - 항상 생성자 안에서만 사용가능
 - 생성자안에서도 맨처음 문장에 와야한다
 - 멤버 변수만큼 인자를 가진 인자생성자를 호출하기 위해서 주로 사용 
 	(멤버 변수보다 작은 생성자 안에서) */
class Point{
	//멤버변수]
	private int x,y;
	//기본생성자]
	public Point() {
		this(1,1);
		System.out.println("기본 생성자");
		//this();[x] 생성자 안에서 첫번째 문장이어야한다
	}
	//인자생성자]
	public Point(int x) {
		/*
		this.x =x;
		y = 1;*/
		this(x,1);
		System.out.println("인자 생성자 : x");
	
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("인자 생성자 : x, y");
	
	}
	
	//멤버 메소드]
	void print() {
		//this(1,1);//[x]생성자에서만 호출 가능
		System.out.println(String.format("X좌표 : %d, Y좌표: %d",x,y));
	}
}///Point
public class Constructor03 {
	
	public static void main(String[] args) {
		//기본생성자로 객체생성]
		Point point1 = new Point();
		point1.print(); 
		Point point2 = new Point(10);
		point2.print(); 
		Point point3 = new Point(10,20);
		point3.print(); 
	}///main
		
}///////class

