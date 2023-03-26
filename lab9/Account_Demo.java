import java.util.Scanner;
class Account
{
	long acc_no;
	double balance;
	void disp()
	{
		System.out.println("The account number of the bank account is "+acc_no);
		System.out.println("The balance in the bank account is "+balance);
	}
}

class Person extends Account
{
	long aadhar_no;
	String name;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the details like name, aadhar no, bank account number, balance: ");
		name=sc.nextLine();
		aadhar_no=sc.nextLong();
		acc_no=sc.nextLong();
		balance=sc.nextDouble();
	}
	
	void disp()
	{
		System.out.println("The name of the person is "+name);
		System.out.println("The aadhar number of the person is "+aadhar_no);
		super.disp();
	}
}

public class Account_Demo
{
	public static void main(String args[])
	{
		Person[] p;
		p=new Person[5];
		for(int i=0;i<5;i++)
		{
			p[i]=new Person();
			p[i].input();
		}
		
		for(int i=0;i<5;i++)
			p[i].disp();
	}
}
