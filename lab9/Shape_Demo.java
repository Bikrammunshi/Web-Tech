import java.util.Scanner;

class Shape
{
	Scanner sc=new Scanner(System.in);
	double area;
	void showArea(){}
	void input(){}
}

class Circle extends Shape
{
	double radius;
	void input()
	{
		System.out.println("Enter the dimensions of a circle: ");
		radius=sc.nextDouble();
	}
	
	void showArea()
	{
		area=22/7.0*radius*radius;
		System.out.println("The area of the circle is "+area);
	}
}

class Rectangle extends Shape
{
	double length;
	double breadth;
	void input()
	{
		System.out.println("Enter the dimensions of a rectangle: ");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	
	void showArea()
	{
		area=length*breadth;
		System.out.println("The area of the rectangle is "+area);
	}
}

public class Shape_Demo
{
	public static void main(String args[])
	{
		Shape c1=new Circle();
		Shape r1=new Rectangle();
		c1.input();
		r1.input();
		c1.showArea();
		r1.showArea();
	}
}
