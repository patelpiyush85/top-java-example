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
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ob1=new A();
		ob1.gets();
		
		B ob2=new B();
		ob2.gets();
		ob2.puts();
		

	}

}