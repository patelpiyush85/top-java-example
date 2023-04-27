//Write a Java program to get a collection view of the values contained in this map.
import java.util.HashMap;
public class CollectionViewValueMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap map=new HashMap();
       map.put(1,"Orange");
		map.put(2,"Red");
		map.put(3,"Pink");
		map.put(4,"Black");
		map.put(5,"White");
		map.put(6,"Green");
		map.put(7,"Yello");
		System.out.println("After value");
		System.out.println(map);
		System.out.println("Before Collections value");
		System.out.println(map.values());
	}

}
