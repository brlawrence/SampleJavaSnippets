package nov2021;
import java.util.Scanner;
public class CaseSwitch {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter name:");
String inputname = input.nextLine();
  switch (inputname)
  {
	case "Richard":
	  System.out.println("dad");
	break;
	case "Annie":
	  System.out.println("mom");
	break;
	case "Karish":
	  System.out.println("first son");
	break;
	case "Kippi":
	  System.out.println("second son");
	break;
  }

}
}
