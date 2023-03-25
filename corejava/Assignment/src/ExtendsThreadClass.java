//W.A.J. P to create one thread by extending Thread class in another Class.

class TestDemo5 extends Thread
{
	public void run()
	{
		System.out.println("Perform task");
		
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		TestDemo5 t=new TestDemo5();
	     Thread th=new Thread(t);
	     th.start();
	}

}
