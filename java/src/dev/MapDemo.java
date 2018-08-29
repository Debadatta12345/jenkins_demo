package dev;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, "java");
		map.put("raj", 4);
		map.put(2, "Python");
		map.put(1, "java");
		map.put("sipu", 5);
		
		Object obj=map.put(3, "Qspider");
		System.out.println(obj);
		
		Object obj1=map.put(3, "Jspider");
		System.out.println(obj1);
		
		map.put(7, null);
		map.put(null, null);
		map.put(8, null);
		System.out.println("...............");
		Set keys= map.keySet();
		for(Object o:keys)
			System.out.println(o);
		
		Collection value= map.values();
		for(Object o:value)
			System.out.println(o);
		System.out.println(keys);
		System.out.println(value);
		
		

	}

}
