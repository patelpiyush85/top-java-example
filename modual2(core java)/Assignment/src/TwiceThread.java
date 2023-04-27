//W.A.J.P to start the same Thread twice by calling
//start () method twice. Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
class TwiceThread1 extends Thread
{
	public void run()
	{
		System.out.println("running...");
	}
}

public class TwiceThread {

	public static void main(String[] args) {
		 TwiceThread1 t1=new  TwiceThread1();
		 t1.start();
		 t1.start();
	}

}
