import java.util.Scanner;
public class trycatchblock {
 int a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Code");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		try {
		System.out.print("Enter A");
		a=sc.nextInt();
		System.out.println("Enter B");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is:"+c);
		int arry[]= {1,2,3,4,5};
		System.out.println("Enter Index Array:");
		int index=sc.nextInt();
		System.out.println("Data:"+arry[index]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caugh:"+e);
		}
		System.out.println("End Code");
		
	}

}
