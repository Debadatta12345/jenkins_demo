package dev;

public class ThreadByExtending_ThreadClass {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		t.start();
		t.run(5);
		

	}

}
