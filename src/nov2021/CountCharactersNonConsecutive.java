package nov2021;

public class CountCharactersNonConsecutive {
	public static void main(String[] args) {
		String a = "a9badbazd9";
		int i,j;int counter = 0;int arrCounter = 0;
		String[] output,finalOutput;
		output = new String[a.length()];
		finalOutput = new String[a.length()];
		int foCounter = 0;int k = 0;
		for (i = 0; i<= a.length()-1;i++){
			 
			for (j=0;j<=a.length()-1;j++) 
			 {
				if (a.charAt(j) == a.charAt(i)) 
				{
					counter++;
				}
			 }
			
			output[arrCounter] = a.charAt(i) + " " + Integer.toString(counter);
			if (i!= a.length()-1) {arrCounter++;}
			counter = 0;
		}
		
		for (i=0;i<=arrCounter;i++) // remove dupes by replacing with " " for dupes
		{
			for (j=0;j<=arrCounter;j++)
			{	
				if ((output[j].equals(output[i])) && (!output[i].equals(" ")))
					{
					  k++;
					  if (k>1) {output[i] = " ";}
					}
			}
			k = 0;
		}
	 for (i=0;i<=arrCounter;i++) { //copy non blank to final output
		 if (!output[i].equals(" ")) {
			 finalOutput[foCounter] = output[i];
			 if (i!=arrCounter) {foCounter++;} 
			 }
		 
	 }
	 for (i=0;i<=foCounter;i++) {
		 System.out.println(finalOutput[i]);
	 }
	
}}
