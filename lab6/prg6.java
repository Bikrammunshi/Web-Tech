//WAP to find the sum of digits of a number
import java.util.Scanner;
class prg6
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(temp>00)
    {
      sum=sum+temp%10;
      temp=temp/10;
    }
    System.out.println("The summation of the digits of a number "+n+" is "+sum);
  }
}
