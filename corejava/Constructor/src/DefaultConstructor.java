
public class DefaultConstructor {
	double height,width,depth;
	DefaultConstructor()
	{
		System.out.println("Default Constructor Called");
		height=3;
		width=2;
		depth=2;
	}
	void volume()
	{
		System.out.println("Volume :"+(height*width*depth));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor df=new DefaultConstructor();
		df.volume();
		
    
	}

}
