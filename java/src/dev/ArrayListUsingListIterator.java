package dev;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListUsingListIterator {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("dev");
		l.add(10);
		l.add("raj");
		l.add(20);
		l.add(50);
		l.add(null);
		ListIterator list=l.listIterator(); 
		while(list.hasNext())
				{
					System.out.println(list.next());
		}

	}

}
