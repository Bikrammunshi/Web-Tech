//WAP to check whether a number is evem or odd
import java.util.Scanner;
class prg2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    if(a%2==0)
      System.out.println("The number is even");
    else
      System.out.println("The number is odd");
  }
}