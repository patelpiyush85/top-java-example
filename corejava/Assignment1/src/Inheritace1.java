//Create a class with a method that prints "This is a parent class" and 
//its subclass with another method that prints "This is child class". Now, 
//create an object for each of the class and call 1 - method of parent class by object of parent class 2 - 
//method of child class by object of child class 3 - method of parent class by object of child class


class parent
{
	void parent1()
	{
		System.out.println("This is a Parent");
	}
}
class child extends parent
{
	void child1()
	{
		System.out.println("This is a child");
	}
}
public class Inheritace1 {

	public static void main(String[] args) {
		parent p=new parent();
		p.parent1();
		child c=new child();
		c.parent1();
		c.child1();

	}

}
