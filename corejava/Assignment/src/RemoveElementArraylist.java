//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class RemoveElementArraylist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
	    list.add("php");
        list.add("oracle");
        list.add("cobol");
        list.add("Net working");
        list.add("Hardware");
        list.add("Red");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		list.add("Green");
		list.add("Yellow");
		list.add(10);
		list.add(true);
		
		System.out.println("Before Remove Element");
		System.out.println(list);
		
		System.out.println("After Remove Element");
		System.out.println(list.remove(2));
		System.out.println(list);
	}

}
