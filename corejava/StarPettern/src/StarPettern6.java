
public class StarPettern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<=4;i++)
	      {
	    	  for(j=3;j>=i;j--)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  
	      
		for(k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		for(i=0;i<=4;i++)
	      {
	    	  for(j=1;j<=i;j++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  
	      
		for(k=4;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
