package com.programming.class2;
class Parent2{
	void show() {
		System.out.println("Parent class function");
		
	}
	int data = 10;
	
}

public class RunTimePolymorphism extends Parent2 {
	
	@Override
	
	void show() {
		System.out.println();
	}
	int data = 20;
	
	void display() {
		
		//this keyword refers to current class object
		//super keyword refers to immediate parent class object
		
		this.show();
		System.out.println("The value of data is " + this.data);
		super.show();
		System.out.println("The value of data is " + super.data);
	}
	
	public static void main(String[] args) {

	    Parent2 obj = new Parent2();

	    obj.show();

	    System.out.println(obj.data);

	    

	    

	    MethodOverriding m = new MethodOverriding();

	    m.say();

	    System.out.println(m.d);

	    

	    m.display();

	    

	    

	}
	
	
	
	
	
	
	
	

}
