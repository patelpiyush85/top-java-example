class A
{
	A()
	{
		System.out.println("A object created");
	}
	void show()
	{
		System.out.println("Show fro A");
	}
}
class B extends A
{
	
	B()
	{
		System.out.println("B object created");
	}
	void show()
	{
      super.show();
		System.out.println("Show fro B");
	}
}
public class ParameterConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
         b.show();
	}

}