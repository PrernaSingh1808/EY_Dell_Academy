package com.programming.class2;

class Machine{
	void start() {
		
		System.out.println("Machine has Started");
	}
	void stop() {
		System.out.println("Machine has Stopped");
	}
}

class Camera extends Machine{
	@override //good prgmg practice - 
	void start() {
		System.out.println("Camera has Started!");
		
	}
	
	void snap() {
		System.out.println("Photo Clicked");
	}
}

public class TypeCastingConcepts {
 
		
		public static void main(String[] args) {
			
			Machine m = new Machine();

	        m.start();//Machine has Started

	        m.stop();//Machine has Stopped

	       Camera c =new Camera();

	        c.start();//Camera has Started

	        c.stop();//Machine has Stopped

	        c.snap();//Photo Clicked!!

	        
		
	        

	        Machine k = new Camera();

	        k.start();//Camera has Started

	        k.stop();//Machine has Stopped
			
			
			
			Camera c1 = new Camera();
			c1.start();
			c1.snap();
			
			
			Machine pc = new Camera(); //upcasting 
			pc.start();
			pc.stop();
			
			
		//Upcasting automatically
			Machine m2 = c;
			m2.start();
			m2.stop();
			
			
			//Downcasting
			
			Machine m3 = new Camera();
			Camera c2 = (Camera)m3; //downcasting
			c2.start();
			c2.stop();
			c2.snap();
			
			
			
			
			
			
			
			
			
			
		}
	}
	


