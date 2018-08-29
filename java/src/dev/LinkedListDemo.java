package dev;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(15);
		l.add("dev");
		l.add("sipu");
		l.add("bank");
		System.out.println(l);
		
		l.set(3, "sujit");
		System.out.println(l);
		
		l.add(0, "rahul");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst("kuna");
		System.out.println(l);
		
		l.add(0, "jitu");
		System.out.println(l);
		
		l.removeAll(l);
		System.out.println(l);
		
	}

}
