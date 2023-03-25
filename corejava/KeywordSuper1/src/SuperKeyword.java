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
		super.show();
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
		super.show();
		System.out.println("C's Default constructor");
	}
	void show() {
		System.out.println("Show From C");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		C c=new C();
		c.show();

	}

}
