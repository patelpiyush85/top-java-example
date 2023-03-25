package com.Exception;

public class CheckingAmount {
	int accno;
	double balance;
	
	public CheckingAmount(int accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	public void deposite(double amount)
	{
		this.balance=this.balance-amount;
	}
   public void Withdraw(double amount) throws InSufficientFund
   {
	   if(amount<=this.balance)
	   {
		   this.balance=this.balance-amount;
	   }
	   else
	   {
		   double need=amount-this.balance;
				   throw new InSufficientFund(need);
	   }
   }
   public void checkBalance()
   {
	   System.out.println("Current Balance:"+this.balance);
   }
}
