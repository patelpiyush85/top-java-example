import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student2 implements Serializable
{
	int Empno;
	String name;
	double per;
	public Student2 (int Empno,String name,double per)
	{
		this.Empno=Empno;
		this.name=name;
		this.per=per;
	}
		public String toString() {
		return "Employee no:"+Empno+"\n\"Employee name:"+name+"\nEmployee per:"+per;
	}
	}

public class IOSeriaslization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student2 st=new Student2(101,"piyush",90.00);
		FileOutputStream fot=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fot);
		oos.writeObject(st);
		oos.flush();
		oos.close();
		System.out.println("Program Success fully run");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student2 s2=(Student2)ois.readObject();
		ois.close();
		System.out.println(s2);
		
	}
	

}
