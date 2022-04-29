package nov2021;
import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter first number:");
	  float a = Float.parseFloat(s.nextLine());
	  System.out.println("Enter second number:");
	  float b = Float.parseFloat(s.nextLine());
	  System.out.println("Addition of numbers: " + (a+b));
	  System.out.println("Multiplication of numbers: "+ (a*b));
	  System.out.println("Substraction of numbers: "+(b-a));
	  System.out.println("Division of numbers: "+(b/a));
	  s.close();
	 
	}
}
