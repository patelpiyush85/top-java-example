//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its constructor
//having parameters for length and breadth is used to initialize the length and breadth of the rectangle. 
//Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for 
//its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle
//and a square.
class Rectangle
{
	double lenght,breath;
	Rectangle(int l,int b)
	{
		lenght=l;
		breath=b;
	}
	void print_area()
	{
		System.out.println(lenght*breath);
	}
	void print_paramiter()
	{
		System.out.println(2*(lenght+breath));
	}
}
class Square extends Rectangle
{
	Square(int s)
	{
		super(s, s);
		
	}

	
}


public class SuperKeywordExample {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(4, 5);
		Square s=new Square(4);
		s.print_area();
		s.print_paramiter();
		r.print_area();
		r.print_paramiter();
	}

}
