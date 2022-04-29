package nov2021;
import java.util.Scanner;


public class TestCalling0 {
String output;
String in;
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("input your string:");
	String input = s.nextLine();
	input = input.trim();
	TestCalling0 tc = new TestCalling0();
	tc.in = input;
	tc.output = TestCalling1.testCalling1(tc.in);
	System.out.println(tc.output);
	s.close();
}
    
}
