class TheaterBookseat1{
	static int total_seat=20;
	static synchronized void bookseat(int seats)
	{
		if(total_seat>=seats)
		{
			System.out.println(seats+":Theater seat book sucessfully----!!");
			total_seat=total_seat-seats;
			System.out.println("seat left:"+total_seat);
		}
		else
		{
			System.out.println(seats+":sorry can not book seat----!! ");
			System.out.println("seat left:"+total_seat);
		}
	}
}
class MyThread1 extends Thread
{
	TheaterBookseat1 b;
	int seats;
	         MyThread1(TheaterBookseat1 b,int seats){
		          this.b=b;
		          this.seats=seats;
	            }
	         public void run()
	         {
	        	 b.bookseat(seats);
	         }
}
class MyThread2 extends Thread
{
	Thread t;
	TheaterBookseat1 b;
	int seats;
	MyThread2(TheaterBookseat1 b,int seats){
   this.b=b;
   this.seats=seats;
	            }
	         public void run()
	         {
	        	
	        	 b.bookseat(seats);
	        	
	         }
}
public class staticSynchronizationmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheaterBookseat1 b1=new TheaterBookseat1();
		
		MyThread1 m=new MyThread1(b1,6);
		m.start();
				
		
			MyThread2 m2=new MyThread2(b1,7);
				m2.start();
		
			TheaterBookseat1 b2=new TheaterBookseat1();
			MyThread1 m3=new MyThread1(b2,4);
			m3.start();
		
			MyThread2 m4=new MyThread2(b2,5);
		m4.start();
	
	}
	

}
