//write a program in java to disply the pattern like right angle triangle with a number
//1
//12
//123
//1234
//12345
public class pattern1 {
	
	public static void main(String[] args)
	{
		int i,j,count=0;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
