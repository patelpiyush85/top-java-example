//Write a Java program to iterate through all elements in a hash list.
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

public class IteratorHashlist {

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
		ListIterator litr=list.listIterator();
		
		while(litr.hasNext())
		{
			litr.set(litr.next()+"  "+  "Tops");
		}
		litr=list.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("Previous order");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}

	}
}
