import java.util.Scanner;
public class SwitchCaseExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
      Scanner sc=new Scanner(System.in);
      System.out.print("ENTER A:");
      a=sc.nextInt();
      System.out.print("ENTER B:");
      b=sc.nextInt();
      System.out.println("1:ADDITION");
      System.out.println("2:SUBSTRATION");
      System.out.println("3.MULTIFICATION");
      System.out.println("4.DIVISION");
      System.out.print("ENTER YOUR CHOICE...");
      d=sc.nextInt();
      switch(d) {
      case 1:
            c=a+b;
            System.out.println("ADDITION:"+c);
            break;
      case 2:
          c=a-b;
          System.out.println("SUBSTRATION:"+c);
          break;
      case 3:
          c=a*b;
          System.out.println("MULTIFICATION:"+c);
          break;
      case 4:
          c=a/b;
          System.out.println("DIVISION:"+c);
          break;
          default:
        	  System.out.print("ENTER INVALID NUMBER...");
              }
	}
}