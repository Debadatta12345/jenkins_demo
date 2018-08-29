package dev;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {

	public static void main(String[] args) {
			ArrayList l=new ArrayList();
			l.add(10);
			l.add(15);
			l.add(8);
			l.add(25);
			Collections.sort(l);
		
			for(Object obj:l)
			{
				System.out.println(obj);
			}

	}

}
