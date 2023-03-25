class A
{
	A()
	{
		System.out.println("A's Default constructor");
	}
	void show() {
		System.out.println("Show From A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B's Default constructor");
	}
	void show() {
		System.out.println("Show From B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C's Default constructor");
	}
	void show() {
		System.out.println("Show From C");
	}
}
public class ConstructorChanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C c=new C();
      c.show();
	}

}
