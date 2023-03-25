 /*write A JAVA PROGRAM Create an abstract class 'Parent' with a method 'message'.
 It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" 
 and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.*/
abstract class Parent
{
abstract void Message();	
}
class subclass1 extends Parent
{
	 void Message()
	{
		System.out.println("This is first subclass");
	}
}
class subclass2 extends Parent
{
	void Message()
	{
		System.out.println("This is Second subclass");
	}
}


public class Abstractmethod {

	public static void main(String[] args) {
		subclass1 sub1=new subclass1();
		sub1.Message();

		subclass2 sub2=new subclass2();
		sub2.Message();
	}

}
