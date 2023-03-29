package basics;

public class Tesla extends Car{
	
	public String variant;
	public int range;
	public String batteryType;
	
	public Tesla() {
		
	}

	public Tesla(String variant, int range, String batteryType) {
		super();
		this.variant = variant;
		this.range = range;
		this.batteryType = batteryType;
	}
	
	public void engineStart() {
		System.out.println("Tesla Engine has Started");
	}
	
	public void teslaScreen() {
		System.out.println("Tesla screen has started");
	}
	
}
