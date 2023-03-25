//Write a Java program to count the number of key-value (size) mappings in a map.
import  java.util.HashMap;
public class SizeMapping {

	public static void main(String[] args) {

HashMap map=new HashMap();
		
		map.put(1,"Orange");
		map.put(2,"Green");
		map.put(3,"Yellow"); 	 	
		map.put(4,"Black");
		map.put(5,"Red");
		map.put(6,"Blue");
		map.put(7,"pink");
		
		System.out.println(map);
		System.out.println("the number of key-value size");
		System.out.println(map.size());
	}

}
