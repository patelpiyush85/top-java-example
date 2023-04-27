//Write a Java program to iterate through all elements in an array list.

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorElement {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add("Orange");
		list.add("Yellow");
		list.add("Blue");
		list.add('t');
		list.add(10.10);
		list.add(true);
		list.add(null);
		list.add(10);
		
		System.out.println(list);
				
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
