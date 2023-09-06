package com.programming.class2;

import java.util.concurrent.TimeUnit;

public class HowSleepMethodsWorks extends Thread {
	
	public static void main(String[] args) {
		HowSleepMethodsWorks t1 = new HowSleepMethodsWorks();
		HowSleepMethodsWorks t2 = new HowSleepMethodsWorks();
		
		t1.start();
		t2.start();
	}
	
	public void run () {
		for(int i = 1; i<5; i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(0);
				
			}catch ( InterruptedException e ) {
				e.printStackTrace();
			}
			
			System.out.println(i);
			
			
		}
	}

}
