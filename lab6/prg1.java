//WAP to find the perimeter and area of a rectangle
import java.util.Scanner;
class prg1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length and breadth of the rectangle");
    int l=sc.nextInt();
    int b=sc.nextInt();
    int perimeter=2*(l+b);
    int area=l*b;
    System.out.println("The perimeter of the rectangle is "+perimeter);
    System.out.println("The area of the rectangle is "+area);
  }
}
