//Write a Java program to retrieve an element (at a specified index) from a given arrayList NOT OK
import java.util.*;
public class SpecifieIndedex {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
        list.add("php");
        list.add("oracle");
        list.add("cobol");
        list.add("Net working");
        list.add("Hardware");
        list.add(10);
        list.add(10.10);
        list.add(null);
        list.add(true);
        System.out.println(list);
        System.out.println(list.indexOf(list));

	}

}
