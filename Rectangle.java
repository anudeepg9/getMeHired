package basics;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double area = width*height;
		System.out.println("The Area of the given rectangle is: "+area);
	}
	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*(width+height);
		System.out.println("The Perimeter of the given Rectangle is: "+perimeter);
	}
	@Override
	public void resize(double x) {
		// TODO Auto-generated method stub
		width*=x;
		height*=x;
		
		
	}
}
