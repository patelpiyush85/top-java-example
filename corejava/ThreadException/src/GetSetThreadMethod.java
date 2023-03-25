//performing get thread name method and set thread name method
class TestDemo5 extends Thread
{
	public void run()
	{
		System.out.println("Thread is exectuted:"+(Thread.currentThread().getName()));
	}
	
}
public class GetSetThreadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello:"+Thread.currentThread().getName());
		TestDemo5 td=new TestDemo5();
		td.setName("Jigar");
		td.start();
		
		TestDemo5 td1=new TestDemo5();
		td1.getName();
		td1.setName("Piyush");
		td1.start();
		
		TestDemo5 td2=new TestDemo5();
		td2.getName();
		td2.setName("nilesh");
		td2.start();
		
	}

}
