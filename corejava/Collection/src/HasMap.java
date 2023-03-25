import java.util.*;
public class HasMap {

	public static void main(String[] args) {
	
		HashMap map=new HashMap();
		  map.put(1,"piyush");
		  map.put(2,"jigar");
		  map.put(3,"druvisha");
		  map.put(4,"heer");
		  map.put(5,"jayshree");
		  map.put(6,"nilesh");
		  
		  System.out.println(map);
		  System.out.println(map.get(3));
		  System.out.println(map);
		  System.out.println(map.remove("heer"));
		  System.out.println(map);
		  
		  Set set=map.entrySet();
		  Iterator itr=set.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		 
		  
	}

}
