//WAP to find the factorial of a number
import java.util.Scanner;
class prg3
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int n=sc.nextInt();
    int temp=n;
    int fact=1;
    while(temp>1)
    {
      fact=fact*temp;
      temp--;
    }
    System.out.println("The factorial of the number "+n+" is "+fact);
  }
}
