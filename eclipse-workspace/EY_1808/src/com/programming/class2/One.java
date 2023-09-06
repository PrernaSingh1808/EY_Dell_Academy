package com.programming.class2;

abstract class Shape {
	
	//unique functionality - define
	
	abstract void draw(); //declaration
	
	int length, area, breath, height, radius;
	
	double areaOfCircle;
	
	//common functionality which every one can use
	
	void purpose() {
		System.out.println("Calculate area of different shapes: ");
		
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		
		int breath = 20, height = 30;
		area = (breath*height)/2;
		System.out.println("Area of Triangle is " + area);
		
		
	}
	
}

class Rectangle extends Shape {

	@Override
	void draw() {
		int length = 30, breath = 40;
		area = length*breath;
		System.out.println("Area of rectangle is " + area);
		
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		int radius = 7;
		area = (int)Math.PI * radius*radius;
		System.out.println("Area of Circle is " + area);
		
	}
	
}

public class One{
	public static void main(String[] args) {
		//Shape sh = new Shape();
		
		Triangle tr = new Triangle();
		tr.draw();
		Rectangle react = new Rectangle();
		react.draw();
		Circle circ = new Circle();
		circ.draw();
		
		
	}
	
}

