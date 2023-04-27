//Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.HashSet;

public class RetainElementHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
	       hs.add("Php");
	       hs.add("Oracle");
	       hs.add("Cobol");
	       hs.add("Net working");
	       hs.add("Hardware");
	       System.out.println("After  set one Element");
	       System.out.println(hs);
	       HashSet hs1=new HashSet();
	       hs1.add("Php");
	       hs1.add("Oracle");
	       hs1.add("Notepad");
	       hs1.add("Programing");
	       hs1.add("Java");
	       System.out.println("After  set two Element");
	       System.out.println(hs1);
	       System.out.println("Before both set Retain");
	       hs.retainAll(hs1);
	       System.out.println(hs);
	       

	}

}
