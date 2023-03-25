package com.Exception;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAmount c=new CheckingAmount(101,1000);
   Scanner sc=new Scanner(System.in);
   double amount;
   while(true)
   {
	   System.out.println("1:Deposite");
	   System.out.println("2:Withdraw");
	   System.out.println("3:CheckBalance");
	   System.out.println("4:Exit");
	   System.out.println("******************");
	   System.out.println("Enter Your Choice:");
	   System.out.println("******************");
	   int choice=sc.nextInt();
	   
	   if(choice==1)
	   {
		   System.out.println("Enter Depost Amount"); 
		   amount=sc.nextInt();
		   c.deposite(amount);
	   }
	   if(choice==2)
	   { 
		   try {
			   
		   
		   System.out.println("Enter Withdraw Amount");
		   amount=sc.nextInt();
		  c.Withdraw(amount);
		   System.out.println("******************");
		   }catch(InSufficientFund e) {
			   System.out.println("Sorry you need Another"+ e.getAmount() +"Rs.Withdraw");
		   }
		   if(choice==3)
		   {
			   c.checkBalance();
			   System.out.println("******************");
		   }
		if(choice==4)
		{
			System.out.println("Good Bye");
			 System.out.println("******************");
		  }
	   }
	   
     }
   }
}
