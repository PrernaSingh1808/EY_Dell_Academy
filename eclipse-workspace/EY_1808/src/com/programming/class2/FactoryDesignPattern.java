package com.programming.class2;

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
	}

}
