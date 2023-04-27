//Create a class to print an integer and a character with two methods having the same name 
//but different sequence of the integer and the character parameters. For
//example, if the parametersof the first method are of the form (int n, char c), 
//then that of the second method will be of the form (char c, int n).

class Print
{
	void form(int n,char c)
	{
		System.out.println("Integer:" +n+"   Character:"+c);
	}
	void form(char c,int n)
	{
		System.out.println("Character:" +c+"  Integer:"+n);
	}
}




public class CharString {

	public static void main(String[] args) {
		
       
		Print p=new Print();
		p.form(10, 'c');
		p.form('c', 10);
		
		
	}

}
