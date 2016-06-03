package decoratorDesignPattern;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
		// TODO Auto-generated constructor stub
	}

	public void draw()
	{
		shapeDecorator.draw();
		setBorderColour(shapeDecorator);
	}

	private void setBorderColour(Shape shapeDecorator) {
		// TODO Auto-generated method stub
		System.out.println("Border colour Red");
	}
	

}
