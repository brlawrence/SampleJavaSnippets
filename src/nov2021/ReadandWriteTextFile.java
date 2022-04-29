package nov2021;
import java.io.*;
public class ReadandWriteTextFile {
public static void main(String[] args) throws Exception {
	File myfile = new File("C:\\Users\\brlaw\\OneDrive\\Documents\\Learn IT\\Simplilearn\\Core Java\\Input text file.txt");
BufferedReader br = new BufferedReader(new FileReader(myfile));
String st;String[] input_record = new String[50] ;int c = 0;
while ((st = br.readLine()) !=null)
  {
	input_record[c] = st;
	c = c + 1;
  }
System.out.println("number of rows = "+ c);

// Sort the file
String temp;
for (int k = 0;k < c-1;k++) {
	for (int l = 0;l < c-1;l++) {
		if (input_record[l].compareTo(input_record[l+1]) > 0) {
			temp = input_record[l];
			input_record[l] = input_record[l+1];
			input_record[l+1] = temp;
		}
	}
} 

// Write Text File
FileWriter fwriter = new FileWriter("C:\\Users\\brlaw\\OneDrive\\Documents\\Learn IT\\Simplilearn\\Core Java\\my output.txt");
for (int j = 0; j < c ; j++) {
fwriter.write(input_record[j]);
fwriter.write("\n");
}
fwriter.close(); 
}
}
