/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/

public class Multiplecatch {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsExceptionOccurs");
		}
		catch(Exception e)
		{
			System.out.println("ParentException Occurs");
		}
		System.out.println("code Execute");
	}

}
