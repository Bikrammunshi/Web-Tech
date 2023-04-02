import java.util.Scanner;
interface salary
{
	void earnings();
	void deductions();
	void bonus();
}

abstract class Manager implements salary
{
	Scanner sc=new Scanner(System.in);
	double basic;
	double earning;
	
	public void earnings()
	{
		System.out.println("Enter the basic salary ");
		basic=sc.nextDouble();
		earning=basic + 0.8*basic + 0.15*basic;
		System.out.println("The earning is "+earning);
	}
	
	double deduction;
	public void deductions()
	{
		deduction=0.12*basic;
		System.out.println("The deductions are "+deduction);
	}
	
}

class Substaff extends Manager
{
	double b;
	public void bonus()
	{
		b=0.5*basic;
		System.out.println("The bonus of the employee is "+b);
	}
}

public class Manager_Demo
{
	public static void main(String args[])
	{
		Substaff s=new Substaff();
		s.earnings();
		s.deductions();
		s.bonus();
	}
}
