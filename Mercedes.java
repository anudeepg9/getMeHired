package basics;

public class Mercedes extends Car{
	
	public String variant;
	public String color;
	public char series;
	
	public Mercedes() {
		
	}
	
	public Mercedes(String variant, String color, char series) {
		super();
		this.variant = variant;
		this.color = color;
		this.series = series;
	}
	
	public void engineStart() {
		System.out.println("Mercedes Engine strated");
	}
	
	public void mercedesSteer() {
		System.out.println("Mercedes steer wheel Auto");
	}
	
	public void mercedesSteer(String direction) {
		System.out.println("Mercedes steer wheel turned "+direction);
	}
	
}
