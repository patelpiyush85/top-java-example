//• Write a Java program that reads a positive integer and count the number of digits the number.
//Input an integer number less than ten billion: 125463
//Number of digits in the number: 6
import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Digit Number is:");
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Count Digit Number is:" +count);
				
         
	}

}
