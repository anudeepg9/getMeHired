package basics;

public class Audi extends Car{
	
	public String variant;
	public String color;
	public String series;
	
	public Audi() {
		
	}

	public Audi(String variant, String color, String series) {
		super();
		this.variant = variant;
		this.color = color;
		this.series = series;
	}
	
	
	public void startEngine() {
		System.out.println("Audi Engine has started");
	}
	
	public void signalLight() {
		System.out.println("Audi tail lights were switched ON");
	}
	
	public void audiAutoPilot() {
		System.out.println("Audi AutoPilot is ON");
	}
	
}
