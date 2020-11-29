package interface18;

public class FigureDrawbleApp {

	public static void main(String[] args) {
		Figure f = new Rectangle(100, 100);
		f.area("사각형");
		((Rectangle)f).draw("선 4개로 사각형");
		
		Drawable d = new Triangle(100,100);
		((Triangle)d).area("삼각형");
		d.draw("선 3개로 삼각형");
		
		d = new Circle(100);
		((Circle)d).area("원");
		d.draw("이어진 곡선 하나로 원");
	}

}