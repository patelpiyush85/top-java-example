import java.util.ArrayList;
//Write a Java program of swap two elements in an array list.

import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        	
        ArrayList list1=new ArrayList();
        list1.add("Red");
		list1.add("Pink");
		list1.add("Black");
		list1.add("White");
		list1.add("Green");
		list1.add("Yello");
		list1.add("Php");
        list1.add("Oracle");
        list1.add("Cobol");
        list1.add("Net working");
        list1.add("Hardware");
		
		
		System.out.println("After Two Element");
		System.out.println(list1);
		System.out.println("Before Two Element");
		Collections.swap(list1, 3, 5);
		System.out.println(list1);
	}

}
