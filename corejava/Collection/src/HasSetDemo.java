import java.util.HashSet;
import java.util.Iterator;
public class HasSetDemo {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10.10);
		set.add("tops");
		set.add(null);
		set.add(true);
		set.add(10);
		
		System.out.println(set);
		
       System.out.println(set.remove(10));
       set.add(10);
       System.out.println(set.isEmpty());
       System.out.println(set.contains(10));
       System.out.println(set);
       
       Iterator itr=set.iterator();
      
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
    	   
       }
       
	}

}
