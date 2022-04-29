package nov2021;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TwoDimentionalLists {
public static void main(String[] args)
{
 // List<type> listname = new ArrayList
	List<List<String>> familyPhone = new ArrayList<List<String>>();
	    familyPhone.add(Arrays.asList("Richard","309-577-2288"));
	    familyPhone.add(Arrays.asList("Annie","309-777-2263"));
	    familyPhone.add(Arrays.asList("Karish","480-546-4433"));
	    
     // Printing out 2 dimentional array using for each loop
	    
	    for (List<String> rows: familyPhone)
	    {
	    	for (String mystr : rows)
	    	{
	    		System.out.print(mystr+" ");
	    	}
	    	System.out.println();
	    }
}}
