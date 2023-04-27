//W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
public class CompareString {

	public static void main(String[] args) {
		String str1="topsint.com";
		String str2="topsint.com";
		String str3="Topsint.com";
		System.out.println("Comparing "+str1+" and "+str2+":"+str1.equals(str2));
		System.out.println("Comparing "+str3+" and "+str1+":"+str3.equals(str1));
	}

}
