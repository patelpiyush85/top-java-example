class box
{
	double height,width,depth;
	box()
	{
		System.out.println("       ");
		System.out.println("Default constructor call");
		height=3;
		width=2;
		depth=4;
	}
	box(double h,double w,double d)
	{
		System.out.println("       ");
		System.out.println("perametrize constructor call");
		height=h;
		width=w;
		depth=d;
		
	}
	box(box b)
	{
		System.out.println("       ");
		System.out.println("Copy Constructor call");
		height=b.height;
		width=b.width;
		depth=b.depth;
	}
	void volume()
	{
	
		System.out.print("volume is:"+(height*width*depth));
		
	}
}
public class allconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b1=new box();
		b1.volume();
		box b2=new box(4,6,7);
		b2.volume();
		box b3=new box(b2);
        b3.volume();
	}

}
