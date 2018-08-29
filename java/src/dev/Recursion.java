package dev;

public class Recursion {

	static int i=5;
	public static void main(String[] args) {
		
		display();
		}
	public static void display() {
		if(i>=0) {
			System.out.println("Display");
			i--;
			display();
		}
		i++;
		System.out.println(i);
		
	}
}
