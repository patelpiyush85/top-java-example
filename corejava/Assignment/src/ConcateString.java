//W.A.J.P to concatenate a given string to the end of another string.
public class ConcateString {

	public static void main(String[] args) {
		String str1="Corejava Exercises and";
		String str2=" Advance Exercises";
		
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		
		String str3=str1.concat(str2);
		System.out.println("Concatenate string is:"+str3);
	}

}
