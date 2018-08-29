package dev;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			System.out.println(sum);
		
		}
		if(temp==sum)
		{
			System.out.println("armstrong no:"+sum);
		}
		else
		{
			System.out.println("not armstrong:"+sum);
		}

}

}
