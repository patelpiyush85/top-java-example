import java.util.Scanner;

public class SumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.print("sum is:" +sum);
	}

}
