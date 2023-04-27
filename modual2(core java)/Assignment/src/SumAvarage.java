//write a java program java to input 5 number from keyboard and find their sum and average using a for loop

import java.util.Scanner;
public class SumAvarage {

	public static void main(String[] args) {
		int i;
		int sum=0;
		int n=0;
		double avg;
		
       for(i=1;i<=5;i++)
       {
    	   Scanner sc=new Scanner(System.in);
   		System.out.println("Enter 5 number:");
   		n=sc.nextInt();
    	   sum=sum+n;
    	   
       }
       avg=sum/5;
       System.out.println("Sum is 5 number:"+sum);
       System.out.println("Sum is 5 number:"+avg);
	}

}
