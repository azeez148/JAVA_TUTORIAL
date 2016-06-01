package Inheritence;

public class main {

	
	static {
		
		System.out.println("main");
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Staff();


		System.out.println(employee.salary());
	}

}
