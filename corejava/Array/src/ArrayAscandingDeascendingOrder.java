import java.util.Scanner;

public class ArrayAscandingDeascendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++) 
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(i=0;i<5;i++) 
		{
		
			System.out.print(a[i]+ " ");
		}
		
		
	}


	}

