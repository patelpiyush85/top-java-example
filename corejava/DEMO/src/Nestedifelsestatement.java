

public class Nestedifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20; int b=50; int c=80;
    if(a>b) 
    {
    	
    	if(a>c) 
    	{
    		System.out.println("a");
    	}
    		else
    		{
    			System.out.println("c");
    		}
    }
    	else
    	{

    		if(b>c)
    		{
    			System.out.println("b");
    		}
    		else
    		{
    			System.out.println('c');
    	}
    }

}
}