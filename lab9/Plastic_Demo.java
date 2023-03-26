import java.util.Scanner;
class Plastic
{
	double length;
	double breadth;
	double height;
	double cost;
	void input(){}
	void display(){}
}

class Sheet extends Plastic
{
	Scanner sc=new Scanner(System.in);
	void input()
	{
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	
	void display()
	{
		double area=length*breadth;
		cost=area*40.0;
		System.out.println("The cost of the plastic sheet is "+cost);
	}
}

class Box extends Plastic
{
	Scanner sc=new Scanner(System.in);
	void input()
	{
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		height=sc.nextDouble();
	}
	
	void display()
	{
		double volume=length*breadth*height;
		cost=volume*60.0;
		System.out.println("The cost of the plastic box is "+cost);
	}
}

public class Plastic_Demo
{
	public static void main(String args[])
	{
		Plastic s1=new Sheet();
		Plastic b1=new Box();
		System.out.println("Enter the dimensions of a 2D sheet");
		s1.input();
		System.out.println("Enter the dimensions of a 3D box");
		b1.input();
		s1.display();
		b1.display();
	}
}
		
