/*W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, 
 * then throw an Arithmetic Exception otherwise print a message welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/

import java.util.Scanner;

public class LessthaneightException {

	public static void main(String[] args) {
		int age;
		//int age=Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age:");
		age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid Age");
			
		}
		else
		{
			System.out.println("Welcome to vote");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
         System.out.println("Normal Flow");
	}

}
