//performing single task from multiple thread
class TestDemo2 extends Thread
{
	public void run()
	{
		System.out.println("Performing in task");
	}
}
public class SingleClassMultipleThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestDemo2 t=new TestDemo2();
       t.start();
       
       TestDemo2 t2=new TestDemo2();
       t2.start();
	}

}
