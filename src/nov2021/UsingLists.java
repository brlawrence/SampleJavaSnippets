package nov2021;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class UsingLists {
public static void main(String[] args)
{
  List<String> mylist = Arrays.asList("Richard"
		                             ,"Annie"
		                             ,"Kripak"
		                             ,"Karish"
		                             ,"Bentley");	
  Collections.sort(mylist);
    
  for (String mystr : mylist) 
  {
	  System.out.println(mystr);  
  }
}}
