import java.util.Scanner;

public class CalculateStudentGrade {

	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks:");
		no=sc.nextInt();
		
		
		if(no>=100 && no<90)
		{
			char grade='A';
			System.out.println(grade);
		}
		else if (no>=90 && no<80)
		{
			char grade='B';
			System.out.println(grade);
		}
		else if (no>=80 && no<70)
		{
			char grade='B';
			System.out.println(grade);
		}	
		else if (no>=70 && no<60)
		{
			char grade='C';
			System.out.println(grade);
		}
		else if (no>=60 && no<50)
		{
			char grade='D';
			System.out.println(grade);
		}
		else if (no>=50 && no<41)
		{
			String grade="DD";
			System.out.println(grade);
		}
		else if(no>=41 && no<0)
		{
			String grade="Fail";
		System.out.println(grade);
		}
		

	}

}
