//Write a Java program to update specific array element by given element.
import java.util.ArrayList;

public class UpdateElementArraylist {

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
			
			System.out.println("Before Update Element");
			System.out.println(list);
			
			
			System.out.println("After Update Element");
			list.set(4,"eclips");
			list.set(5, "java");
			list.set(11,16);
			list.set(12, null);
			
			System.out.println(list);
			
	}

}
