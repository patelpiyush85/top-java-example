import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		int year;
	
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if((year%400==0)||(year%4==0 && (year%100!= 0)))
		{
			System.out.println(year+ "  is leap year");
		}
		else
		{
			System.out.println(year+ "is non-leap year");
		}

	}

}
