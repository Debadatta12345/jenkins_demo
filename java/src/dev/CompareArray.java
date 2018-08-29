package dev;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40};
		
		if(Arrays.equals(a, b))  
		{
			System.out.println("array is equal");
		}
		else
		{
			System.out.println("array is not same");
		}
	}

}
