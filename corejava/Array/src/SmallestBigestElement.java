import java.util.Scanner;

public class SmallestBigestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,min;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
	
  for(i=0;i<5;i++)
  {
	 if(a[i]<min) 
	 {
	  min=a[i];
	 }
	 }
  System.out.print("Smalle Element:" +min);
  }
}