package dev;

public class Test {

	public static void main(String[] args) {
		Bank b=new Axis();
		Bank b1=new Icici();
		//Axis b=new Axis();
		//Icici b1=new Icici();
		System.out.println("interest in Axis ban:"+b.intrest());
		System.out.println("intrest in Icici bank:"+b1.intrest());
	}

}
interface Bank
{
	public double intrest();
}
class Axis implements Bank
{
	public double intrest()
	{
		return 15.2;
	}
}
class Icici implements Bank
{
	public double intrest()
	{
		return 12.5;
	}
}











