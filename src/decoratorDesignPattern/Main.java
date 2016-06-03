package decoratorDesignPattern;

public class Main {

	
	/**
	 * Advantages 
	 * 1) Decorator design pattern is used to add additional features or behaviors to a
	 *  particular instance of a class, while not modifying the other instances of same class. 
	 *  Decorators provide a flexible alternative to sub-classing for extending functionality.
	 * 
	 * 
	 * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
	 * 
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Rectangle();
		System.out.println("Drawing Rectangle");
		shape.draw();
		
		Shape shape2 = new RedShapeDecorator(new Rectangle());
		System.out.println("Drawing Red Colour Rectangle");
		shape2.draw();
		
	}

}
