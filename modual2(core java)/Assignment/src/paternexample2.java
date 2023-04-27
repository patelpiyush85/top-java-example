/*• Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:
	1
	2 3
	4 5 6
	7 8 9 10 */

public class paternexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j,count=0;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				count=count+1;
				
				System.out.print(" "+count);
				
			}
			System.out.println();
		}
	}

}
