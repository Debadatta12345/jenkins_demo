package dev;

public class Equals {

	String name;
	String author;
	int page;
	
	public Equals(String name,String author,int page)		
	{
	this.name=name;
	this.author=author;
	this.page=page;
	}
	public boolean equals(Object a1)
	{
	
		Equals b1=(Equals)a1;
	
	return this.name==b1.name && this.author==author && this.page==b1.page ;
	}
	public static void main(String[]args)
	{
		Equals b2=new Equals("java","agarwal",5000);
		Equals b3=new Equals("java","agarwal",5000);
		Equals b4=new Equals("j2ee","ramanuj",6000);
	
	System.out.println(b2.equals(b3));
	System.out.println(b2.equals(b4));
	System.out.println(b3.equals(b4));
	}
}
