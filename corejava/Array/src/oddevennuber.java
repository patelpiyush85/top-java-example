import java.util.Scanner;

public class oddevennuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element....");
		for(i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even nuber is Array");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
			System.out.println(+a[i]);
		}
		}
		System.out.println("Odd nuber is Array");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) {
			System.out.println(+a[i]);
		}
		}
  }
	}

  
  
  
  
  
  
  
  
	 
		
  