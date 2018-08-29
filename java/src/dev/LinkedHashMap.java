package dev;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {
			 HashMap map=new java.util.LinkedHashMap();
			 map.put(5, "c");
			 map.put(2, "c++");
			 map.put(4, "java");
			 map.put(1, "j2ee");
			 map.put(3, "selenium");
			 
			 System.out.println(map);
			Set key= map.keySet();
			 System.out.println(key);
			 Collection values=map.values();
			 System.out.println(values);
			
			 
		

}
}
