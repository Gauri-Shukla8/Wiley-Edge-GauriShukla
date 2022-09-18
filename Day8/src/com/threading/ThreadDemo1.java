package com.threading;

public class ThreadDemo1 extends Thread {
	
	public void run() {
		System.out.println("Threademo1  is executed");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		
	}

}
