//W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3.
public class stratcolor {

	public static void main(String[] args) {
		String str1 = "Red is favorite color.";
		String str2 = "Orange is also my favorite color.";
		
		String startStr = "Red";
		
		boolean starStr1=str1.startsWith(startStr);
		boolean starStr2=str2.startsWith(startStr);
		System.out.println( str1 + " starts with " +
	             startStr + "? " + starStr1);
	        System.out.println(str2 + " starts with " +
	             startStr + "? " + starStr2);
	}

}
