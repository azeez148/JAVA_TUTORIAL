package factoryDesignPatterns;

public abstract class Plan {

	public int rate;
	public abstract void getRate();
	
	public void calculateInterest(int units)
	{
		System.out.println(rate * units);
	}
}
