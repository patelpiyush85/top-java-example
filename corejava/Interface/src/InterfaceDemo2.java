interface RBI
{
	void roi(double r);
}
class SBI implements RBI
{
	public void roi(double r)
	{
		System.out.println("SBI ret of interest:"+r);
	}
}
class BOB implements RBI
{
	public void roi(double r)
	{
		System.out.println("BOB ret of interest:"+r);
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI S1=new SBI();
		S1.roi(4.29);
		
      BOB b=new BOB();
      b.roi(5.29);
	}

}
