package dev;

public class PrimeNo {

	public static void main(String[] args) {
		int n=128;
		//int count=0;
		
	/*	for(int i=0;i<=15;i++) {
			if(i%2==0) {
				System.out.println("not prime number");
			}else if(i%2!=0){
				System.out.println("prime number");
			}
		}*/
		
		
		if(n%2==0) {
			System.out.println(n+" is not prime number");
		}else if(n%2!=0){
			System.out.println("prime number");
		}
	}
}
