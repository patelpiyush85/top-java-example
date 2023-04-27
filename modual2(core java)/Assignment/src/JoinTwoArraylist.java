import java.util.ArrayList;
//Write a Java program to join two array lists.
public class JoinTwoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Join Two Array List");
		list1.addAll(list);
		System.out.println(list1);
	}

}
