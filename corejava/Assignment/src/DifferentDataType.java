//Create a class named 'Print Number' to print various 
//numbers of different data types by creating different
//methods with the same name 'printn' having a parameter for each data type.
class printn
{
	void integer(int i)
	{
		System.out.println("Integer:"+i);
	}
	void String(String str)
	{
		System.out.println("String:"+str);
	}
	void Character(char c)
	{
		System.out.println("Character:"+c);
	}
	void Double(double d)
	{
		System.out.println("Double:"+d);
	}
	void Float(float f)
	{
		System.out.println("Float:"+f);
	}
}


public class DifferentDataType {

	public static void main(String[] args) {
		printn p=new printn();
		
		p.integer(10);
		p.Character('c');
		p.String("piyush");
	     p.Float(10.10f);
	     p.Double(10.10);

	}

}
