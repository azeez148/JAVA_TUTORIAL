package factoryDesignPatterns;

public class FactoryPlan {

	public Plan getPlan(String planType)
	{
		if(planType == null)
			return null;
		else if(planType.equalsIgnoreCase("Commercial"))
			return new Commercial();
		else if(planType.equalsIgnoreCase("Industrial"))
			return new Industrial();
		
		return null;
	}
}
