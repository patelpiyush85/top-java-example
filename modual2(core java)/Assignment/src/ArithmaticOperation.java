//• Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) {
	   int a,b,c;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter A:");
	   a=sc.nextInt();
	   System.out.print("Enter B:");
	   b=sc.nextInt();
	   
	   c=a/b;
	   System.out.println("Division By:"+c);
	}

}
