//write a java program to take three number from user and print Gretest number
import java.util.Scanner;

public class GretestNumber {
	int no1,no2,no3;
	void TestDemo()
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter No 1:");
	     no1=sc.nextInt();
	     System.out.println("Enter No 2:");
	     no2=sc.nextInt();
	     System.out.println("Enter No 3:");
	     no3=sc.nextInt();
	     if(no1>no2 && no1>no3)
	     {
	    	 System.out.println("Number 1 is Gretest:"+no1);
	     }
	     else if (no1<no2 && no3<no2)
	     {
	    	 System.out.println("Number 2 is Gretest:"+no2);
	     }
	     else
	     {
	    	 System.out.println("Number 3 is Gretest:"+no3); 
	     }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GretestNumber g=new GretestNumber();
		g.TestDemo();
	}

}
