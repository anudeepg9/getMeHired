package basics;

public class CarMain {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("petrol", 4, "Audi");
		c1.startEngine();
		c1.parkingBrake();
		c1.parkingBrake("Peter ");
		c1.signalLight();
		
		Audi c2 = new Audi("Q3", "Black", "4");
		c2.accelerate();
		c2.applyBrake();
		c2.startEngine();
		c2.audiAutoPilot();
		
		Mercedes c3 = new Mercedes("CMG", "White", '4');
		c3.accelerate();
		c3.applyBrake();
		c3.engineStart();
		c3.mercedesSteer();
		c3.mercedesSteer("Left");
		
		Tesla c4 = new Tesla("x",400,"lithium");
		c4.accelerate();
		c4.applyBrake();
		c4.engineStart();
		c4.teslaScreen();
		
		
        CarMain obj = new CarMain();  
        System.out.println(obj.function(1., 20)); 
	}	
	
    private String function(float i, int f)  
	    {  
	        return ("gfg");  
	    } 
	private String function(double i, double f)  
	    {  
	        return ("GFG");
	    }
	       
}


/* a) The first two methods of all the three objects of subclasses is inherited from parent Car
 * 
 * b) The third method in all three objects of subclasses is overridden - Method Overriding
 * 
 * c) Two methods with same method name for C1 and C3 objects state - Method Overloading
 * 
 * d)The last methods in all three objects of subclasses are child class methods
 * 
 * 
 * 
 * Answer for question 2 would be option A i.e, GFG as the call goes to constructor with double which has highest precedence
 * 
 * 
 */



