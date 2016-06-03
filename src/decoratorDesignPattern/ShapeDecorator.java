package decoratorDesignPattern;

public abstract class ShapeDecorator implements Shape{

	protected Shape shapeDecorator;
		
	public ShapeDecorator(Shape decoratorShape){
		this.shapeDecorator = decoratorShape;
	}
	
	public void draw()
	{
		shapeDecorator.draw();
	}
	
	
	
}
