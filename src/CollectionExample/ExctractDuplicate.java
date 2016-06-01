package CollectionExample;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author srigin.ms
 *
 */
public class ExctractDuplicate {

	
	public static void main(String arg[])
	{
		
		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(2);
		input.add(5);
		input.add(5);
		
		Set<Integer> duplicates = extractDuplicate(input);
		Set<Integer> usingSetFunction = extractUsingSet(input);
		//System.out.println(duplicates);
		System.out.println(usingSetFunction);
		
	}

	
	
	private static Set<Integer> extractUsingSet(List<Integer> input) {
		// TODO Auto-generated method stub
		Set<Integer> origin = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for (Integer integer : input) {
			
			if(origin.add(integer))
			{
				//duplicte.add(integer);
			}
			else
			{
				duplicates.add(integer);
			}
		}
		return duplicates;
	}

	private static Set<Integer> extractDuplicate(List<Integer> input) {
		// TODO Auto-generated method stub
		Set<Integer> duplicte = new HashSet<>();
		
		for (int i = 0; i < input.size(); i++) {
			
			for (int j = i; j < input.size(); j++) {
				
				if(input.get(i) == input.get(j) && i!=j )
				{
					duplicte.add(input.get(i));
					
				}
					
			}
		}
		
		return duplicte;
	}
	
}
