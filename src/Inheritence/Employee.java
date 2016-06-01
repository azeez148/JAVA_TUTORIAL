package Inheritence;

public class Employee {

	static{
		System.out.println("Hello");
		
	};
	
	{ 
		System.out.println("Verum Block");
		
	};
	int salary = 1000;
	
	public int salary()
	{
		
		try{
			
			throw new Exception();
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			//return 3;
		}
		
	}
	
}
