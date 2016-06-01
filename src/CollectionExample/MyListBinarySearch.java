package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListBinarySearch {

	
	public MyListBinarySearch()
	{
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(26, 20, "Rahul"));
		employeeList.add(new Employee(5, 20, "Rahul"));
		employeeList.add(new Employee(1, 10, "Arun"));
		employeeList.add(new Employee(2, 20, "Rahul"));
		
		Employee searchKey = new Employee(1, 10, "Arun");
		
		int employee = Collections.binarySearch(employeeList, searchKey, new EmpComparator());
		System.out.println("Index" + employee);
		
	}
}
