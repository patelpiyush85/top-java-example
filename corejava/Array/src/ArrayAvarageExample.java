import java.util.Scanner;

public class ArrayAvarageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp; int sum=0; double avg;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) 
		{
		
			System.out.print(a[i]+ " ");
		}
		for(i=0;i<5;i++)
		{
		  sum=a[i]+sum;
		}
		avg=sum/5.0;
		
		System.out.print(" \n Addition=" +sum+" \n Avarage="+avg);
		
		

	}

}
