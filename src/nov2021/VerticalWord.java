package nov2021;
import java.util.Scanner;
public class VerticalWord {
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner s = new Scanner(System.in);
	String a = s.nextLine();
	int l = a.length();
	for (int i = 0; i<=(l-1);i++) {
	System.out.println(a.charAt(i));
	}
}
}
