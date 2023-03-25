//W.A.J. P to create one thread by implementing Runnable interface in Class.


class TestDemo1 implements Runnable
{
	public void run()
	{
		System.out.println("Perform task");
		
	}
}
public class RunnableInterfaceTheard {

	public static void main(String[] args) {
		TestDemo1 t=new TestDemo1();
	     Thread th=new Thread(t);
	     th.start();

	}

}
