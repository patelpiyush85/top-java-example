//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5
//5 + 55 + 555
import java.util.Scanner;
public class PositiveIntergerNuber {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number:");
		n=sc.nextInt();
		System.out.printf("%d+%d%d+%d%d%d\n",n,n,n,n,n,n);		

	}

}
