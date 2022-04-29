package nov2021;
import java.util.Scanner;
public class ArraySortInteger {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 int[] inputArray;
	 inputArray = new int[5];
	System.out.println("Enter 5 values for Array");
	
	for (int i = 0;i < 5; i++) {
		inputArray[i] = s.nextInt();
	}
	System.out.println("The array you entered are:");
	for (int i = 0;i < 5; i++) {
		System.out.println(inputArray[i]);
	}
	int temp;
	for (int i = 0;i < 4; i++) {
		for (int j = 0;j < 4;j++) {
			if (inputArray[j] > inputArray[j+1]) {
				temp = inputArray[j];
				inputArray[j] = inputArray[j+1];
				inputArray[j+1] = temp;
			}
		}
	}
	System.out.println("The sorted values are:");
	for (int i = 0;i < 5;i++) {
		System.out.println(inputArray[i]);
	}
	s.close();
	}
	}



