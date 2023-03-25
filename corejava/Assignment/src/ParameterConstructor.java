/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
class named 'Triangle' without any parameter in its constructor.*/
class Triangle
{
	int a;
	int b;
	int c;
	Triangle(int a,int b,int c)
	{
	this.a=a;
	this.b=b;
	this.c=c;
	}
	void area()
	{
		System.out.println("Perimeter of a Triangle is:"+(a+b+c));
	}
}


public class ParameterConstructor {

	public static void main(String[] args) {
		
		Triangle t=new Triangle(3,4,5);
		t.area();

	}

}
