class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Child thread");
		t.start();
	}
	public void run() {
	
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Child Thread Exiting");
	}
	
}
public class InterfaceRunnableMethod {

	public static void main(String[] args) throws InterruptedException {
		new NewThread();
		Thread t= Thread.currentThread();
		System.out.println("Current Thread:"+t);
        for(int i=0;i<5;i++)
        {
        	Thread.sleep(3000);
        	System.out.println(t+" : "+i);
        }
        System.out.println("Main Thread Exiting");

	}
	

}
