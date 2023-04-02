import java.util.Scanner;
abstract class Student
{
	long roll;
	long reg;
	abstract void course();
}

class Kiitian extends Student
{
	Scanner sc=new Scanner(System.in);
	void course()
	{
		System.out.println("Enter the roll number, the registration number of the student");
		roll=sc.nextLong();
		reg=sc.nextLong();
		System.out.println("The roll number is "+roll);
		System.out.println("The reg number is "+reg);
	}
}

public class Student_Demo
{
	public static void main(String args[])
	{
		Kiitian k=new Kiitian();
		k.course();
	}
}	
