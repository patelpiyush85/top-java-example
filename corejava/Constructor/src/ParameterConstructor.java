
public class ParameterConstructor {
	double height,width,depth;
	
	ParameterConstructor(double h,double w,double d)
	{
		System.out.println("Parameter Constructor Called");
		height=h;
		width=w;
		depth=d;
		
	}
	void volume()
	{
		System.out.println("Volume :"+(height*width*depth));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor pr=new ParameterConstructor(4,7,8);
		pr.volume();
		

	}

}
