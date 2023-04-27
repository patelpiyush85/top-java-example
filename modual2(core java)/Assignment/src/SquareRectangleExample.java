//Create a class to print the area of a square and a rectangle. The class has two methods with the same name
//but different number of parameters. The method for printing area of a rectangle has two parameters
//which are length and breadth respectively while the other method for printing area of square has one parameter 
//which is side of square.*/

class Area
{
	void Area(float side)
	{
		float side1=side*side;
		System.out.println("The Area of the Square is:"+side1+" sq unit");
	}
	void Area(double lenght,double breadth)
	{
		double ract=lenght*breadth;
		System.out.println("The Area of the Rectangle is:"+ract+" sq.unit");
	}
}
public class SquareRectangleExample {

	public static void main(String[] args) {
		
      Area a=new Area();
      a.Area(10f);
      a.Area(10, 20);
	}

}
