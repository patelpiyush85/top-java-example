import java.util.Scanner;
public class elseiflederstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter your marks");
		Scanner r=new Scanner(System.in);
		marks=r.nextInt();
		if(marks>80) 
		{
			System.out.println("Topper Class");
		}
		else if(marks<80 && marks>=70)
		{
			System.out.println("Distiction Class");
		}
		else if(marks<70 && marks>=60) 
		{
			System.out.println("First Class");
		}
		else if(marks<60 && marks>=50)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Pass Class");
		}
		}

	}


