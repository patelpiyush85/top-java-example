/*• W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument 
and perform the division operation and handle Arithmetic O/P-
Exception in thread main java. Lang. Arithmetic Exception:/ by zero*/

import java.util.Scanner;

public class ArithameticOperation {

	public static void main(String[] args) {
		int a,b,c;
		   try
		   {
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter A:");
		   a=sc.nextInt();
		   System.out.print("Enter B:");
		   b=sc.nextInt();
		   
		   c=a/b;
		   System.out.println("Division By:"+c);
		   }
		   catch(ArithmeticException e)
		   {
			  System.out.println(e.getMessage());
		   }
		   }

	}


