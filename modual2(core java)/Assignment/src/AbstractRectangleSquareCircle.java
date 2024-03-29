/*We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking 
two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth,
that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all
the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
Create an object of class 'Area' and call all the three methods.*/

abstract class Shape
{
	abstract void RectangleArea(double length,double breath);
	abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}
class area extends Shape
{

	
	void RectangleArea(double length, double breath) {
		double area=length*breath;
		System.out.println("Area of Rectangle is:"+area);
		
	}

	void SquareArea(double side) {
		double area=side*side;
		System.out.println("Area of Square is:"+area);
	}

	void CircleArea(double radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle is:"+area);
		
	}
	
}

public class AbstractRectangleSquareCircle {

	public static void main(String[] args) {
		
		area a1=new area();
		a1.RectangleArea(20,20);
		a1.SquareArea(20);
		a1.CircleArea(10);
		
            
            
	}

}
