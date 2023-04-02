import java.util.Scanner;
interface Motor
{
	final int capacity=100;
	void run();
	void consume();
}

class Washing_Machine implements Motor
{
	Scanner sc=new Scanner(System.in);
	int mac;
	public void run()
	{
		System.out.println("Enter the machines running");
		mac=sc.nextInt();
	}
	
	public void consume()
	{
		System.out.println("The machines running are "+mac);
		System.out.println("The machines that are not running are "+(capacity-mac));
	}
}

public class Motor_Demo
{
	public static void main(String args[])
	{
		Washing_Machine wm=new Washing_Machine();
		wm.run();
		wm.consume();
	}
}
