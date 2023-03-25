import java.util.Scanner;

public class CopyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value in first element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter First Element");
		for(i=0;i<5;i++) 
		{
			System.out.print(a[i]+ " ");
		}
		System.out.print("\nEnter Second Element");
		for(i=0;i<5;i++) 
		{
			b[i]=a[i];
			System.out.print(b[i]+ " ");
		}
	}
 
}
