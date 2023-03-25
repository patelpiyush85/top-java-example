//performing runnable interface(implements keyword)
class TestDemo1 implements Runnable
{
	public void run()
	{
		System.out.println("Perform task");
		
	}
}
public class RunnableInterfaceDemo {

	public static void main(String[] args)  { 
		// TODO Auto-generated method stub
     TestDemo1 t=new TestDemo1();
     Thread th=new Thread(t);
     th.start();
	}

}
