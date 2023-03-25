class A1 {
	void gets()
	{
		System.out.println("A method is call");
	}
}
class B1 extends A1{
	void puts()
	{
		System.out.println("B method is call");
	}
}
class C1 extends A1{
	void show()
	{
		System.out.println("C method is call");
	}
}

public class hierarchicalinheritance {

	public static void main(String [] args)
	{
		 A1 obj1=new A1();
	     obj1.gets();
	     System.out.println("------------------");
	     
	     B1 obj2=new B1();
	     obj2.gets();
	     obj2.puts();
	     System.out.println("------------------");
		
	     C1 obj3=new C1();
		 obj3.gets();
		 //obj3.puts();
		 obj3.show();
	}
}
