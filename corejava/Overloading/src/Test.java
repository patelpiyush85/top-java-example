
public class Test {
	 void show()
	 {
		 System.out.println("No Argument");
	 }
     void show(int a)
     {
    	 System.out.println("one Argument");
     }
     void show(int a,int b)
     {
    	 System.out.println("two Argument");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t1=new Test();
     t1.show();
     t1.show(10);
     t1.show(10,40);
	}

}
