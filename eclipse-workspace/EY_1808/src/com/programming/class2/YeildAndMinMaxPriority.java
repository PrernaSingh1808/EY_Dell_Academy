package com.programming.class2;

public class YeildAndMinMaxPriority {
	
	public static void main(String[] args) {
		
		Thread ProducerThread = new Producer();
		Thread ConsumerThread = new Consumer();
		ProducerThread.setPriority(Thread.MAX_PRIORITY);  //Mzx priority is 10
		ConsumerThread.setPriority(Thread.MIN_PRIORITY); //MIN Priority is 0
		ProducerThread.start();
		ConsumerThread.start();
		
	}
}


class Producer extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Producer thread" + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread{
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Consumer Thread " + i);
			Thread.yield();
			
		}
	}
}
