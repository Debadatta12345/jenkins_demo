package dev;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(15);
		l.add(8);
		l.add(25);
		l.add(55);
		Object[] obj=l.toArray();
		for(int i=0;i<=obj.length-1;i++) {
			System.out.println(obj[i]);
			
		}

	}

}
