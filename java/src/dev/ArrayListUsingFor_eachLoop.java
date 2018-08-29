package dev;

import java.util.ArrayList;

public class ArrayListUsingFor_eachLoop {

	public static void main(String[] args) {
			ArrayList l=new ArrayList();
			l.add("dev");
			l.add(10);
			l.add("raj");
			l.add(20);
			l.add(50);
			l.add(null);
			for(Object obj:l)
			{
				System.out.println(obj);
			}

	}

}
