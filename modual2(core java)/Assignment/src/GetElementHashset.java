//Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;

public class GetElementHashset {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		
		set.add(10);
		set.add("Orange");
		set.add("Yellow");
		set.add("Blue");
		set.add('t');
		set.add(10.10);
		set.add(true);
		set.add(null);
		set.add(10);
		System.out.println(set);
	

	}

}
