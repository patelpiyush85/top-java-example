import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(10);
		
   System.out.println(s);
   System.out.println(s.firstElement());
   System.out.println(s.empty());
   System.out.println(s.capacity());
   System.out.println(s.get(5));
   System.out.println(s.indexOf(4));
   System.out.println(s.lastElement());
   System.out.println(s.lastIndexOf(5, 0));
   
   
   System.out.println(s);
  s.pop();
   System.out.println(s);
   s.pop();
   System.out.println(s);
   s.pop();
   System.out.println(s);
   s.pop();
   
	}

}
