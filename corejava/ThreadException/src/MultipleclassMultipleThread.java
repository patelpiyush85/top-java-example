//performing multiple task from multiple thread
class TestDemo3 extends Thread
{
	public void run() {
		System.out.println("Multiple thread class1");
	}
}
	class TestDemo4 extends Thread
	{
		public void run() {
			System.out.println("Multiple thread class2");
		}
}
public class MultipleclassMultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestDemo3 t=new TestDemo3();
     t.start();
     
     TestDemo4 t1=new TestDemo4();
     t1.start();
	}

}
