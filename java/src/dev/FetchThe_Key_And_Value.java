package dev;

import java.util.HashMap;
import java.util.Map;

public class FetchThe_Key_And_Value {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1, "dev");
		m.put(4, "rahul");
		m.put(2, "sujit");
		m.put("kuna", 8);
		m.put(3, "tanmay");
		
		
		System.out.println(m);
		
		System.out.println(m.containsKey(1));
		System.out.println(m.containsKey(5));
		System.out.println(m.containsKey("dev"));
		System.out.println(m.containsKey("mahi"));
		System.out.println(m.containsKey("kuna"));
		
		
		System.out.println(m.containsValue("rahul"));
		System.out.println(m.containsValue("sujit"));
		System.out.println(m.containsValue(9));
		
		

	}

}
