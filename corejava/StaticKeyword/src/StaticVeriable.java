import java.util.Scanner;

public class StaticVeriable {
	 static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
	}
	void putvalue()
	{
		System.out.println("A:"+a);
	}

	public static void main(String[] args) {
		StaticVeriable s1=new StaticVeriable();
		StaticVeriable s2=new StaticVeriable(); 
		StaticVeriable s3=new StaticVeriable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.putvalue();
		s2.putvalue();	
		s3.putvalue();
	}

}
