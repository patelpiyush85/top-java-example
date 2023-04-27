//Write a Java program to print all the elements of an Array List using the position of the elements.
import java.util.ArrayList;
public class PrintElement {

	public static<E> void printArray(E[] inputArray)
	{
		for(E e:inputArray)
		{
			System.out.println(e+"");
		}
	}
	public static void main(String[] args) {
		
		Integer intArray[]= {1,2,3,4,5};
		Double DoubleArray[]= {1.1,2.2,3.3,4.4,5.5};
		Character charArray[]= {'t','o','p','s'};
		String StringArray []= {"Python","Net Working","Cobol","Hardware","Java"};
		
		printArray(intArray);
		printArray(DoubleArray);
		printArray(charArray);
		printArray(StringArray);
       
	}

}
