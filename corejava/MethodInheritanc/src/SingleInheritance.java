import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A:");
		a=sc.nextInt();
	}
	void putA()
	{
		
		System.out.println("A:"+a);	
	}
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B:"+b);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b=new B();
     b.getA();
     b.getB();
     
     b.putA();
     b.putB();
	}

}
