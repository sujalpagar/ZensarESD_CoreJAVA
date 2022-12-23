	package com.multithreading;

public class DemoMultithreading extends Thread {
	
	Thread t1,t2;
	public DemoMultithreading()
	{
		t1 = new Thread(this);
		t1.start();
		
		
		t2 = new Thread(this);
		t2.start();
	}
	
	public void run() {
		synchronized(this) {		
			if(Thread.currentThread()==t1) {
				for(int i=0; i<100; i++) {
					System.out.println("Java.....From T1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					if(i==30) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
		synchronized(this) {
			if(Thread.currentThread()==t2) {
				for(int i=0; i<100; i++) {
					System.out.println("Rocks......From T2");
					try {
						Thread.sleep(80);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					if(i==80) {
						notify();
					}
				}
			}
		}
	}
	
	public static void main(String args[]) {
		DemoMultithreading dt = new DemoMultithreading();
		dt.run();
	}
}
