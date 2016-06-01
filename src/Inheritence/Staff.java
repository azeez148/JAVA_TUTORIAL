package Inheritence;

public class Staff extends Employee{

	int assetCount ;
	static
	{
		System.out.println("Staff");
	};
	{
		System.out.println("Verum staff block");
	};
	public void assetsCount()
	{
		assetCount = 2;
	}
	
	public int salary()
	{
		return assetCount;
		
	}
	
}
