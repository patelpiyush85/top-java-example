class A {
	void gets()
	{
		System.out.println("A method is call");
	}
}
class B extends A{
	void puts()
	{
		System.out.println("B method is call");
	}
}
class C extends B{
	void show()
	{
		System.out.println("C method is call");
	}
}

public class Multilevelinhetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     A obj1=new A();
	     obj1.gets();
	     System.out.println("------------------");
	     
	     B obj2=new B();
	     obj2.gets();
	     obj2.puts();
	     System.out.println("------------------");
		
	     C obj3=new C();
		 obj3.gets();
		 obj3.puts();
		 obj3.show();

	}

}