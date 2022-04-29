package nov2021;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//C:\Users\brlaw\Documents\Learn IT\Simplilearn\Core Java\HelloWorld\myPropertyFile
// The property file is witin the eclipse as a file and looks like key value pairs with equal sign
//  name = "Richard"
//  phone = " xxx" and so on
//
public class AccessingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream myfile = new FileInputStream("C:\\Users\\brlaw\\Documents\\Learn IT\\"+
	                           "Simplilearn\\Core Java\\HelloWorld\\myPropertyFile");
		Properties prop = new Properties();
		prop.load(myfile);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("phone"));
	}

}
