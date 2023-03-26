/*
Implement a class Number having data members value. Include the following

i) boolean is_Even(): to check whether the number is even or not
ii)boolean is_Prime(): to check whether the number is prime or not
iii)boolean is_Perfect(): to check whether the number is perfect or not
iv) int find_Factorial(): recursive method to find the factorial

Write down the application class Number_Demo where the functionality of the
Number_Demo is tested.
*/

import java.util.Scanner;
class Number
{
  int n;
  boolean is_Even()
  {
    if(n%2==0)
      return true;
    else
      return false;
  }

  boolean is_Prime()
  {
    int count=0;
    for(int i=2;i<n;i++)
      if(n%i==0)
        count++;
    if(count==0)
      return true;
    else
      return false;
  }

  boolean is_Perfect()
  {
    int sum=0;
    for(int i=1;i<n;i++)
      if(n%i==0)
        sum=sum+i;
    if(sum==n)
      return true;
    else
      return false;
  }

  int find_Factorial(int n)
  {
    if(n<1)
      return 1;
    else
      return n*find_Factorial(--n);
    }
  }


public class Number_Demo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Number obj=new Number();
    System.out.println("Enter a number");
    obj.n=sc.nextInt();
    if(obj.is_Even()==true)
      System.out.println("The number is even");
    else
      System.out.println("The number is odd");
    if(obj.is_Prime()==true)
      System.out.println("The number is prime");
    else
      System.out.println("The number is not prime");
    if(obj.is_Perfect()==true)
      System.out.println("The number is perfect");
    else
      System.out.println("The number is not perfect");
    System.out.println("The factorial of the number is "+obj.find_Factorial(obj.n));
  }
}
