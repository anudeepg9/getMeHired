package basics;

public class Parent {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.printMsg();
	}
}

class ParentClass {

		   //Overridden method
		   void display(){
			System.out.println("This is parent class method");
		   }
}

class SubClass extends ParentClass {
		   void display(){
			System.out.println("Child class method");
		   }
		   void printMsg(){
			display();
			super.display();
		   }
}

