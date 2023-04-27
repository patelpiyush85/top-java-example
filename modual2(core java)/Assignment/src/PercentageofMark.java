/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and
in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters 
for student B. Create an object for each of the two classes and print the percentage of marks for both the students.*/

abstract class Mark
{
	abstract void getPercentage();
}

class StudentA extends Mark
{
	float sub1,sub2,sub3,sub4;
	float per;
	StudentA(float a,float b,float c,float d)
	{
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
		
	}
	@Override
	void getPercentage() {
		per=(sub1+sub2+sub3+sub4)/400*100;
		System.out.println("StudentA percentage:"+per);
		//return per;
		
	}
}
class StudentB extends Mark
{
	float sub1,sub2,sub3,sub4;
	float per;
	StudentB(float a,float b,float c,float d)
	{
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
	}
		@Override
		void getPercentage() {
			per=(sub1+sub2+sub3+sub4)/400*100;
			System.out.println("StudentB percentage:"+per);
			//return per;
			
		}
	
	}
public class PercentageofMark {

	public static void main(String[] args) {
		
		StudentA s1=new StudentA(70,80,70,90);
		s1.getPercentage();
		StudentB s2=new StudentB(70,60,60,90);
		s2.getPercentage();

	}

}
