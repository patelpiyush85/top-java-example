
class base{
	base()
	{
		System.out.println("Base Object is Created");
	}
}
class child extends base
	{
		child(){
			System.out.println("Child object is created");
		}
	}

class Grandbase extends child
{
	Grandbase(){
		System.out.println("Grandbase object is created");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandbase b=new Grandbase();
	}

}
