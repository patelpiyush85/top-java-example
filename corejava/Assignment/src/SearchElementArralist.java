//Write a Java program to search an element in an array list.
import java.util.ArrayList;

public class SearchElementArralist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
        list.add("php");
        list.add("oracle");
        list.add("cobol");
        list.add("Net working");
        list.add("Hardware");
        System.out.println("Before Search Element");
        System.out.println(list);
        
        System.out.println("After Search Element");
        System.out.println(list.get(4));
        //System.out.println(list);
	}

}
