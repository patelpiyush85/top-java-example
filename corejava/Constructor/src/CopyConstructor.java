
public class CopyConstructor {
	double height,width,depth;
	DefaultConstructor()
	{
		System.out.println("Default Constructor Called");
		height=3;
		width=2;
		depth=2;
	}
	ParameterConstructor(double h,double w,double d)
	{
		System.out.println("Parameter Constructor Called");
		height=h;
		width=w;
		depth=d;
		
	}
	CopyConstructor (CopyConstructor c)
	{
		System.out.println("Copy Constructor Called");
		height=c.height;
		width=c.width;
		depth=c.depth;
		
	}
	void volume()
	{
		System.out.println("Volume :"+(height*width*depth));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor df=new DefaultConstructor();
		df.volume();
		ParameterConstructor pr=new ParameterConstructor(4,7,8);
		pr.volume();
		CopyConstructor cn=new CopyConstructor();
		cn.volume();

	}

}
