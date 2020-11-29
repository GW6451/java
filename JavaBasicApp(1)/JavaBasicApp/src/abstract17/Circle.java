package abstract17;

public class Circle extends Figure {
	//[인자 생성자]
	public Circle(int radius) {
		//this.radius=radius;//[o]
		super(-1,-1,radius);
		System.out.println("Circle의 인자 생성자");
	}
	@Override
	void area(String figureName) {
		System.out.println(figureName+"의 면적:"+radius*radius*Math.PI);	
	}

}
