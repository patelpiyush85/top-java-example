package inheritancemethod;
class P
{
	void showP()
	{
		System.out.println("P method is call");
	}
}
class Q extends P
{
	void showQ()
	{
		System.out.println("Q method is call");
	}
}
class R extends P
{
	void showR()
	{
		System.out.println("R method is call");
	}
}
public class heeraricalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p1=new P();
		p1.showP();
		System.out.println("--------------");
		Q q1=new Q();
		q1.showP();
		q1.showQ();
		System.out.println("--------------");
		R r1=new R();
		r1.showP();
		r1.showR();
		

	}

}
