//Write a Java program to replace the second element of an Array List with the specified element.

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceSecondElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
        list.add("php");
        list.add("oracle");
        list.add("cobol");
        list.add("Net working");
        list.add("Hardware");
        System.out.println("After Element");
        System.out.println(list);
        System.out.println("Replace Second Element");
        list.set(1, "Python");
        System.out.println(list);
        
        
	}

}
