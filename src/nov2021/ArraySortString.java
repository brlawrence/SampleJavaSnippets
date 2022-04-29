package nov2021;
public class ArraySortString {
	public static void main(String[] args) {
		String input[] = new String[]
		{ "Richard"
		 ,"Annie"
		 ,"Karish"
		 ,"Kippi"};
		System.out.println("Total elements "+input.length+"\n ");

 String temp;
for (int i=0;i<3;i++) {
	for (int j=0;j<3;j++) {
		if (input[j].compareTo(input[j+1]) > 0)
		{
			System.out.println("inside loop");
			temp = input[j];
			input[j] = input[j+1];	
			input[j+1] = temp;
		}
		
	}
	}
for (int i=0;i<=3;i++) {
	System.out.println(input[i]);
}
}
}
