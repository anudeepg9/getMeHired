package basics;

public class Car {
	
	private String engine;
	private int wheels = 4;
	private int doors;
	private int seats;
	private int bootspace;
	private String name;
	
	public Car()
	{
		
	}
	public Car(String engine, int doors, String name) {
		this.engine = engine;
		this.doors = doors;
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getBootspace() {
		return bootspace;
	}

	public void setBootspace(int bootspace) {
		this.bootspace = bootspace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void startEngine() {
		System.out.println("Engine Started");
	}
	
	public void applyBrake() {
		System.out.println("Brake has been Applied");
	}
	
	public void accelerate() {
		System.out.println("Accelerator pedal applied");
	}
	
	public void parkingBrake() {
		System.out.println("Car is in parking mode");
	}
	
	public void parkingBrake(String name) {
		System.out.println(name + "Car is in parking mode");
	}
	
	public void signalLight() {
		System.out.println("Car Signal Light is ON");
	}
	
	
}
