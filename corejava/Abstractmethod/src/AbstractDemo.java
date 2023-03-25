abstract class vehicle
{
	abstract void strat();
}
class car
{
	void start() {
		System.out.println("Strat with key");
	}
}
class scooter extends car
{
	void start() {
		System.out.println("Strat with kick");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 car c=new car();
		c.start();
		
		scooter s=new scooter();
		s.start();
		

	}

}
