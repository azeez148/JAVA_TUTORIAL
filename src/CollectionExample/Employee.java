package CollectionExample;

public class Employee {

	int employeeID;
	int salary;
	String empName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int employeeID, int salary, String empName) {
		this.employeeID = employeeID;
		this.salary = salary;
		this.empName = empName;
	}


	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

	
}
