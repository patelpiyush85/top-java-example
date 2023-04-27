import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position.
public class InsertElement {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
         list.add("php");
         list.add("oracle");
         list.add("cobol");
         list.add("Net working");
         list.add("Hardware");
         System.out.println("Before insert Element");
         System.out.println(list);
         
         list.add(0,"Java");
         System.out.println("After insert Element");
         System.out.println(list);
         	
	}

}
