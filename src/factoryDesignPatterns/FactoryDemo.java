package factoryDesignPatterns;

public class FactoryDemo {

	
	public static void main(String arg[])
	{
		
		FactoryPlan factoryPlan = new FactoryPlan();
		Plan plan = factoryPlan.getPlan("Commercial");
		plan.getRate();
		plan.calculateInterest(1);
		
		
	}
}
