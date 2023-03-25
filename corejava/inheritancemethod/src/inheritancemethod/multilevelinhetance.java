package inheritancemethod;
class X
{
	void showX1()
	{
		System.out.println("X is method call");
	}
}
class Y extends X
{
	void showY1()
	{
		System.out.println("Y is method call");
	}
}
class Z extends Y
{
	void showz1()
	{
		System.out.println("Z is method call");
	}
}

public class multilevelinhetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	X x1=new X();
	x1.showX1();
	System.out.println("----------");
	Y y1=new Y();
	y1.showX1();
	y1.showY1();
	System.out.println("----------");
   Z z1=new Z();
   z1.showX1();
   z1.showY1();
   z1.showz1();
	}

}
