package basics;

public class StudentData {
	
	private int stuId;
	private String stuName;
	private int stuAge;
	
	//default constructor
	public StudentData() {
		
	}
	
	//parameterized constructor
	public StudentData(int stuId, String stuName, int stuAge) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	
	public static void main(String args[]) {
		
		StudentData sd1 = new StudentData();
		sd1.stuId=500;
		sd1.stuName="Anudeep";
		sd1.stuAge=20;
		System.out.println("The Student Name is: "+sd1.stuName);
		System.out.println("The Student Age is: "+sd1.stuAge);
		System.out.println("The Student Id is: "+sd1.stuId);
		
		StudentData sd2 = new StudentData(555, "Chaitanya", 25);
		System.out.println("The Student Name is: "+sd2.stuName);
		System.out.println("The Student Age is: "+sd2.stuAge);
		System.out.println("The Student Id is: "+sd2.stuId);
	}

}
