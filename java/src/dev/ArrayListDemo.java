package dev;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(15);
		l.add("dev");
		l.add(10);
		l.add(20);
		//System.out.println(l);
		l.remove(1);
		//System.out.println(l);
		l.add("sipu");
		l.add(99);
		//System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
		

	}

}
