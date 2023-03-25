
public class StaticMethod {
	static int a=10;
	static int b;
	static  void match(int x)
	{
		System.out.println("X  :  "+x);
		System.out.println("A  :" +a);
		System.out.println("B :  "+b);
	}
	{
		System.out.println("Normal method");
	}
	static
	{
		System.out.println("Static block initilization");
		b=4*a;
	}
	{
		System.out.println("Normal method");
	}
	StaticMethod()
	{
		System.out.println("Default Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod s1=new StaticMethod();
		match(12);
	}

}
