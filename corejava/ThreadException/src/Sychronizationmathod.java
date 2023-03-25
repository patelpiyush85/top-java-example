class callback
{
	String msg;
public void	call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(2000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("]");
	}
	
}
class caller implements Runnable
{
   Thread t;
   callback c;
   String msg;
    caller(String msg,callback c)
    {
    	this.c=c;
    	this.msg=msg;
    	t=new Thread(this);
    	t.start();
    }
	public void run() {
		synchronized(c)
		{
		c.call(msg);
		}
		
	}
	
}
public class Sychronizationmathod {

	public static void main(String[] args) {
		
    callback c=new callback();
    
    caller c1=new caller("hello",c);
    caller c2=new caller("hello piyush",c);
    caller c3=new caller("Sychronization",c);
    
	}

}
