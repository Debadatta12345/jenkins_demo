package dev;

public class Test1 {

	public void run()
{
System.out.println("run method");	
}
public void run(int i)
	{
		System.out.println("my run method");
	}

public static void main(String[] args) {
	Test1 t=new Test1();
	t.run();
	t.run(14);
}
}