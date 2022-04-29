package nov2021;
import java.util.Scanner;
public class ScannerSample {

	public static void main(String[] args) {
		
		String name = " ";
		do {
		System.out.println("What is your name ?");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		String name1 = name.substring(0,4);
		System.out.println("heloo nice to hear from you back " + name1 + "!");
		}while (!name.equals("end4"));
		}
	}