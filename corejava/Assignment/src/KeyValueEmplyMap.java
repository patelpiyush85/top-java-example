//Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;

public class KeyValueEmplyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap map=new HashMap();
		
		map.put(1,"Orange");
		map.put(2,"Green");
		map.put(3,"Yellow");
		map.put(4,"Black");
		map.put(5,"Red");
		map.put(6,"Blue");
		map.put(7,"pink");
		
		System.out.println(map);
		System.out.println("sIs map Empty:"+map.isEmpty());
		
	}

}
