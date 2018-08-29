package ExceptionHandling;

public class CalledException {

	public static void main(String[] args) {
		System.out.println("main start");
		CalledException c=new CalledException();
		c.display(25,5);
		c.display(30,15);
		c.display(20,0);
		System.out.println("main ended");
		
		

	}
	void display(int i,int j)
	{
		try {
		int res=i/j;
		System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occur");
		}
	}

}
