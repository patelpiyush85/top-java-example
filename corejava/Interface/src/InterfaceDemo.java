interface I1
{
	void show();
}
interface I11 extends I1
{
	void disply();
}
class I3 implements I1,I11
{
	public void show()
	{
	System.out.println("one interface is call");
}
	public void disply()
	{
		System.out.println("Two interface is call");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I3 s=new I3();
		s.show();
		s.disply();	
	}
}
