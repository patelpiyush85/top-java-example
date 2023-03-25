import java.util.Scanner;
class A
{
	int a;
	A()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A:");
	a=sc.nextInt();
	}
	void gets() {
		System.out.println("A:"+a);
	}
}
class B extends A
{
	int b;
	B()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter B:");
	b=sc.nextInt();
	}
	void puts() {
		System.out.println("B:"+b);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B b1=new B();
   b1.gets();
   b1.puts();
    
	}

}
