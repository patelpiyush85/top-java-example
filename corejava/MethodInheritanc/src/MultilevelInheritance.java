import java.util.Scanner;

class A1
{
	int a;
	void getA1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A:");
		a=sc.nextInt();
	}
	void putA1()
	{
		
		System.out.println("A:"+a);	
	}
}
class B1 extends A1
{
	int b;
	void getB1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER B:");
		b=sc.nextInt();
	}
	void putB1()
	{
		System.out.println("B:"+b);
	}
}
class C1 extends B1
{
	int c;
	void getC1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER C:");
		c=sc.nextInt();
	}
	 void putC1()
	{
		System.out.println("C:"+c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		C1 c=new C1();
		c.getA1();
		c.getB1();
		c.getC1();
		
		c.putA1();
		c.putB1();
		c.putC1();

	}

}
