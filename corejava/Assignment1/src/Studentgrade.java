import java.util.Scanner;
//import java.lang.*;

public class Studentgrade {

	public static void main(String[] args) {
		int marks=100;
		String grade ;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Marks:");
		marks=sc.nextInt();
		if(marks>=100)
		{
			grade="A";
		}
		else if(marks>=80)
		{
			grade="B";
		}
		else if(marks>=70)
		{
			grade="c";
		}
		else if(marks>=60)
		{
			grade="D";
		}
		else if(marks>=41 && marks<=50)
		{
			grade="DD";
		}
		else
		{
			grade="fail";
		}
		
	
System.out.println("Your grade is"+grade);
	}

}
