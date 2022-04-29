package nov2021;

public class CountRepeatingChars {
	public static void main(String[] args) {
		String a = "abbcccdddde";
		int i; int counter = 0;int j;
		String[] output = new String[a.length()];
		int arrCounter = 0;
		for (i=0;i<a.length();i++) 
		{
			if (i == 0) {       //skip first iteration, but count as 1
				counter++;
				continue;
				}
			if (a.charAt(i) == a.charAt(i-1))
				{
					counter++;	//count repetitions till it becomes different
				}
			else
				{				//when its different gather count in array
					//output[arrCounter] = a.charAt(i-1)+" "+Integer.toString(counter);
				    writeToArray(output,arrCounter,a,i,counter);
					arrCounter++;
					counter = 1;
				}
			if (i == a.length()-1)
				{
				  writeToArray(output,arrCounter,a,i+1,counter);
				}
		}
		for (j=0;(j<=arrCounter);j++)
				{
				 System.out.println(output[j]);
				}
	}
	 private static void writeToArray(String[] output,int arrCounter,String a,int i,int counter) 
	   {
		 output[arrCounter] = a.charAt(i-1)+" "+Integer.toString(counter);
	   }
	
}