package nov2021;
import java.util.Scanner;
import java.util.StringTokenizer;
/* 
  Take a sentence and prints one word  per line. 
  To demostrate the usage of a sample utility called String Tokenizer
  
 */
public class SentenceToWords {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Sentence:");
	String input1 = input.nextLine();
	StringTokenizer word1 = new StringTokenizer(input1," ");
	 while (word1.hasMoreTokens()) {
		 System.out.println(word1.nextToken());
	 }
	
}
}
