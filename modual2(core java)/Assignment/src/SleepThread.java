//W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.
class newthread implements Runnable
{
Thread t;
public newthread()
{
	t=new Thread(this,"Child Thread");
			t.start();
}
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(t+":"+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Exiting");
	}
	
}
public class SleepThread {

	public static void main(String[] args) throws Exception {
		
      new Thread();
      Thread t=Thread.currentThread();
      for(int i=0;i<5;i++) {
    	  System.out.println(t+":"+i);
    	  Thread.sleep(1000);
      }
      System.out.println("Main Thread Exiting");
	}

}
