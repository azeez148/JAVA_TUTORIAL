package CollectionExample;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmployeeID() == o2.getEmployeeID())
			return 0;
		else
			return -1;
	}



}
