package basics;
import java.util.Scanner;

public class FirstJavaProgram {

	//method to calculate sum of first n natural numbers
	public void sumOfNumbers(int n) {
		//iterating to get the sum
		int j=0;
		for(int i=0; i<=n; i++)
		{
		    j = i+j;
		}
		//printing the sum
		System.out.println("The Sum of First "+n+" Natural Numbers is: "+j);
	}
	
	// method to calculate factorial using while loop
	public void factorial(int n) {
		int i=1;
		int j=1;
		//iterating to get the factorial
		while(i<=n)
		{
			j = i*j;
			i++;
		}
		//printing the factorial
		System.out.println("The Factorial of the Given Number is: "+j);
	}
	
	public static void main(String[] args) {
		//taking input from the user
		System.out.println("Please enter the number:");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		
		FirstJavaProgram fj1 = new FirstJavaProgram();
		fj1.sumOfNumbers(n);
		fj1.factorial(n);
		

	}

}
