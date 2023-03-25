	/*• W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
		try
		{//code}
		catch (Exception e)
		{//code}
		catch (Exception e)
		{//code}*/

public class MultipleTryCatch {


	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
		
		try
		{
			 a[5]=30/0;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Occurs");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Occurs");
		}
		
		
		System.out.println("Code Execute");
	}

		
	}
	

