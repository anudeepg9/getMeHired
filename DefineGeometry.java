package basics;

public class DefineGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(2, 3);
		rec1.getArea();
		rec1.getPerimeter();
		rec1.resize(2);
		rec1.getArea();
		rec1.getPerimeter();
		
		Circle c1 = new Circle(5);
		c1.getArea();
		c1.getPerimeter();

	}

}
