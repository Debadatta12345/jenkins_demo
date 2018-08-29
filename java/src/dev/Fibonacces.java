package dev;

public class Fibonacces {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		System.out.println(i);
		System.out.println(j);
		for(int k=3;k<=10;k++)
		{
			int c=i+j;
			System.out.println(c);
			i=j;
			j=c;
		
		}

	}

}
