class Student
{
	int sno;
	String sname;
	Student()
	{
		System.out.println("Default Constructor Call");
	}
	Student(int sno,String sname)
	{
		this();
		this.sno=sno;
		this.sname=sname;
	}
	void disply()
	{
		System.out.println("Student RollNo:"+this.sno);
		System.out.println("Student Name:"+this.sname);
		
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student(1,"piyush");
      s1.disply();
	}

}
