package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListFill {

	public static void main(String arg[])
	{
		
		List<String> myList = new ArrayList<String>();
		myList.add("My");
		myList.add("List");
		System.out.println("Original List"+ myList);
		
		Collections.fill(myList, "Replaced");
		System.out.println("New List" + myList);
		
	}
	
	
}
