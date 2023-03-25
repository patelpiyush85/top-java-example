import java.util.Scanner;

class A3
{
	int a;
	void getA3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A:");
		a=sc.nextInt();
	}
	void putA3()
	{
		
		System.out.println("A:"+a);	
	}
}
class B3 extends A3
{
	int b;
	void getB3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER B:");
		b=sc.nextInt();
	}
	void putB3()
	{
		System.out.println("B:"+b);
	}
}
class C3 extends A3
{
	int c;
	void getC3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER C:");
		c=sc.nextInt();
	}
	 void putC3()
	{
		System.out.println("C:"+c);
	}
}

public class HyrarchieInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 c3=new C3();
		B3 b3=new B3();
		c3.getA3();
		b3.getB3();
		b3.getA3();
		c3.getC3();
		
		c3.putA3();
		b3.putB3();
		c3.putC3();
		c3.putA3();
		
		
	}

}
