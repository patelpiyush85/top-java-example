/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/

import java.util.Scanner;

public class FactorialNumber {
        
	public static void main(String[] args) {
		
		int i,fact=1,no;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		no=sc.nextInt();
		
for(i=1;i<=no;i++)
{
	
	fact=fact*i;
}
       // while(i<=no)
       // {
      //      fact=fact*i;
      //      i++;
       // }
        System.out.println("Factorial of the number: "+fact);
		

	}

}
