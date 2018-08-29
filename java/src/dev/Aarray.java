package dev;

public class Aarray {

	public static void main(String[] args) {
	int[] a= {10,20,30,40,50,60};
	
	int temp=a[0];
	a[0]=a[a.length-1];
	a[a.length-1]=temp;
	
	temp=a[1];
	a[1]=a[a.length-2];
	a[a.length-2]=temp;
	
	temp=a[2];
	a[2]=a[a.length-3];
	a[a.length-3]=temp;
	for(int k:a)
	{
		System.out.println(k);
	}
	
	}
}