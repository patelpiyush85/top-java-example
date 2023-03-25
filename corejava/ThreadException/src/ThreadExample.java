
public class ThreadExample {

	public static void main(String[] args) throws Exception {
		Thread t= Thread.currentThread();
		System.out.println("Current Thread:"+t);
		t.setName("My Thread");
		System.out.println("After change Thread:"+t);
		t.setPriority(7);
        System.out.println("Change After thread Priority:"+t);
        for(int i=0;i<5;i++)
        {
        	Thread.sleep(2000);
        	System.out.println(t+" : "+i);
        }
	}

}
