//WAP to check whether a number is prime or not
import java.util.Scanner;
class prg7
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    boolean flag=true;
    for(int i=2;i<n;i++)
      if(n%i==0)
      {
        flag=false;
        break;
      }

    if(flag==true)
      System.out.println(n+" is a prime number");
    else
      System.out.println(n+" is not a prime number");
  }
}
