
class base{
	base()
	{
		System.out.println("Base Object is Created");
	}
class child extends base
	{
		child(){
			System.out.println("Child object is created");
		}
	}
}

public class constructorinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      child c=new child();
	}

}
