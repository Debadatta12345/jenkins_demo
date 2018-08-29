package dev;

public class MyThread extends Thread {
	public void run() {
		System.out.println("no arg method");
		}
	public  void run(int i) {
		System.out.println("int arg method");

	}

	}


