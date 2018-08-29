package dev;

public class Encapsulation {

	public static void main(String[] args) {
		
		Account a1=new Account();
		System.out.println(a1.getaccNo());
		a1.setpwd("dev125");
		System.out.println(a1.getpwd());
		a1.setaddress("marathali");
		System.out.println(a1.getaddress());
		
	}

}
class Account
{
	private double accNo=12345;
	private String pwd;
	private String address;
	
	public double getaccNo()
	{
		return accNo;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
	public String getpwd()
	{
		return pwd;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return address;
	}
}










