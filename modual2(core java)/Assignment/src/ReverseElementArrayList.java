//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementArrayList {

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
		System.out.println("After Reverse");
		System.out.println(list);
		System.out.println("Before Reverse");
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
