abstract class abc1
{
void mat1()
{
	System.out.println("match1");
}
abstract void mat2();
}
class abc2 extends abc1
{
	void mat2()
	{
		System.out.println("match2");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc2 a=new abc2();
		a.mat1();
		a.mat2();
	}
}
