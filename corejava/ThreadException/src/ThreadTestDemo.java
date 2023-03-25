//performing single task from single thread.
//perrforming theard extends keyword
class TestDemo extends Thread
{
	public void run() 
	{
		System.out.println("Performing task");
	}
}

public class ThreadTestDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TestDemo t=new TestDemo();
		t.start();

	}

}
