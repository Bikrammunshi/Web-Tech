import java.util.Scanner;
class Plastic
{
	double length;
	double width;
	double height;
	double thick;
	void display(){}
}

class Plate extends Plastic
{
	Plate(double l,double w)
	{
		length=l;
		width=w;
	}
	void display()
	{
		System.out.println("The dimensions of a plate are: \n Length: "+length+"\n Width: "+width);
	}
}

class Box extends Plastic
{
	Box(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	void display()
	{
		System.out.println("The dimensions of a box are: \n Length: "+length+"\n Width: "+width+"\n Height: "+height);
	}
}

class WoodBox extends Plastic
{
	WoodBox(double l,double w,double h,double t)
	{
		length=l;
		width=w;
		height=h;
		thick=t;
	}
	void display()
	{
		System.out.println("The dimensions of a box are: \n Length: "+length+"\n Width: "+width+"\n Height: "+height+"\n Thickness: "+thick);
	}
}

public class Multilevel_Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double l,w,h,t;
		System.out.println("Enter the length and breadth of a plate");
		l=sc.nextInt();
		w=sc.nextInt();
		Plastic p1=new Plate(l,w);
		p1.display();
		System.out.println("Enter the length and breadth and the height of a box");
		l=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		Plastic b1=new Box(l,w,h);
		b1.display();
		System.out.println("Enter the length and breadth and the height and the thickness of a woodbox");
		l=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		t=sc.nextInt();
		Plastic wb1=new WoodBox(l,w,h,t);
		wb1.display();
	}
}
		
