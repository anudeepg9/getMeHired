package basics;

public class Circle extends Shape implements Resizeable{
	
	private double radius;
	
	public Circle(double radius) {
		super(1);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public void resize(double x) {
		radius*=x;
	}

	@Override
	public void getArea() {
		double area = Math.PI*radius*radius;
		System.out.println("The area of the circle with given radius id: "+area);
		
	}

	@Override
	public void getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		System.out.println("The Perimeter of the circle with given radius is: "+perimeter);
		
	}
	
	
}
