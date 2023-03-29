package basics;

public class RtTriangle extends Shape{
	public double width;
	public double height;
	
	public RtTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double area = (0.5*width*height);
		System.out.println("The Area of the given Traingle is: "+area);
	}
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = (width+width+height);
		System.out.println("The Perimeter of the given Triangle is: "+perimeter);
	}
	
}
