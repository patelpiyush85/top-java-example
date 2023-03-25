//Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

public class SortElementArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		list.add("Php");
        list.add("Oracle");
        list.add("Cobol");
        list.add("Net working");
        list.add("Hardware");
        list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("White");
		list.add("Green");
		list.add("Yello");
		//list.add(10);
		//list.add(true);
		System.out.println("Before Sort Element");
		System.out.println(list);
		System.out.println("After Sort Element");
		Collections.sort(list);
		System.out.println(list);
		
	}

}
