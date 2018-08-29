package dev;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> map=new TreeMap<String,Integer> ();
		 map.put("c",5);
		 map.put("c++",6);
		 map.put("java",4 );
		 map.put("j2ee",1);
		 map.put("selenium",3);
		// map.put(null, null);
		 //map.put(8, null);
		 
		 System.out.println(map);
	}

}
