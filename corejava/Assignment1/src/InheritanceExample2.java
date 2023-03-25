//Create a class named 'Shape' with a method to print "This is this is shape". 
//Then create two other classes named 'Rectangle', 'Circle' 
//inheriting the Shape class, both having a method to print "This is rectangular shape" 
//and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' 
//having a method to print "Square is a rectangle". Now call the method of 'Shape' and 
//'Rectangle' class by the object of 'Square' class.
class Shape
{
	void print_Shape()
	{
		System.out.println("This is this is shape");
	}
}
class Ract extends Shape
{
	void print_Ractangle()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape
{
	void print_Circle()
	{
		System.out.println("This is Circle shape");
	}
}
class squa extends Ract
{
	void print_Square()
	{
		System.out.println("This is Square shape");
	}
}
public class InheritanceExample2 {

	public static void main(String[] args) {
		
		squa sq=new squa();
		sq.print_Ractangle();
		sq.print_Shape();
		sq.print_Square();
		 Ract r=new  Ract();
		r.print_Ractangle();
		r.print_Shape();
		

	}

}
