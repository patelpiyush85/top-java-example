class TestDemo6 extends Thread
{
	public void run()
	{
		System.out.println("Child priority:"+Thread.currentThread().getPriority());
		System.out.println("Child priority2:"+Thread.currentThread().getPriority());
	}
}
public class PriorityThreadDemo {

	public static void main(String[] args) {
	System.out.println("Main priority old:"+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(10);
	System.out.println("Main priority new:"+Thread.currentThread().getPriority());
	
	TestDemo6 d6=new TestDemo6();
	d6.start();
	d6.setPriority(10);
	
	TestDemo6 d7=new TestDemo6();
	d7.start();
	d7.setPriority(7);
	

	}

}
