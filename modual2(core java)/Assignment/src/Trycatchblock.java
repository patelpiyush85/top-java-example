//W.A.J. P to demonstrate try catch block,
import java.util.Scanner;
public class Trycatchblock {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Start Code");
		  try
		  {
			 
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter A:");
		   a=sc.nextInt();
		   System.out.print("Enter B:");
		   b=sc.nextInt();
		   
		   c=a/b;
		   System.out.println("Division By:"+c);
	}catch(Exception e) {
		System.out.println("Exception Caught");

	}
		  System.out.println("End Code");
}
}
