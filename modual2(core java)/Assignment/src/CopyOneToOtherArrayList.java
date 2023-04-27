//Write a Java program to copy one array list into another.
import java.util.ArrayList;
import java.util.Collections;

public class CopyOneToOtherArrayList {

	public static void main(String[] args) {
       ArrayList list=new ArrayList();
		
		list.add("Php");
        list.add("Oracle");
        list.add("Cobol");
        list.add("Net working");
        list.add("Hardware"); 
        
        ArrayList list1=new ArrayList();
        list1.add("Red");
		list1.add("Pink");
		list1.add("Black");
		list1.add("White");
		list1.add("Green");
		list1.add("Yello");
		
		System.out.println("ArrayList One Element");
		System.out.println(list);
		System.out.println("ArrayList Two Element");
		System.out.println(list1);
		System.out.println("Copy One ArrayList To Other ArrayList");
		Collections.copy(list1,list);
		System.out.println(list1);
		

	}

}
