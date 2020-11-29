package abstract17;

public class FigureApp {

	public static void main(String[] args) {
		//Figure f = new Figure();//[x]인스턴스화 불가 / 형체가 없기떄문에 메모리생성 불가
		//이질화
		Figure f= new Rectangle(100, 100);
		f.area("사각형");
		f = new Triangle(100,100);
		f.area("삼각형");
		f = new Circle(100);
		f.area("원");
		
		//동질화
		Rectangle rect = new Rectangle(100, 100);
		rect.area("사각형");
		
		//rect = new Circle(100);//상속관계 존재하지 않음
		//System.out.println(rect instanceof Circle);//[x]
		System.out.println(rect instanceof Figure);//[o]
		
	}////main

}///////class
