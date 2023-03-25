

import java.util.Scanner;
public class IFStatment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		System.out.println("Enter your Number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0)
		{
			System.out.println("Nuber is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
