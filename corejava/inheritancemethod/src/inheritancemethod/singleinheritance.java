package inheritancemethod;
class A
{
	void showA()
	{
		System.out.println("A is method call");
	}
}
class B extends A
{
	void showB()
	{
		System.out.println("B is method call");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new A();
		a1.showA();
		System.out.println("--------------");
		B b1=new B();
		b1.showA();
		b1.showB();

	}

}
