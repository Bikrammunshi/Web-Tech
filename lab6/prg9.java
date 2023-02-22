//WAP to find the roots of a quadratic equation
import java.util.Scanner;
import java.lang.Math;
class prg9
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the coefficients of the equation");
    double a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
    double d=(b*b)-(4*a*c);
    double r1,r2;
    if(d<0)
      System.out.println("The roots are imaginary");
    else if(d==0)
    {
      r1=(-1)*b/(2*a);
      System.out.println("The roots are real and equal and are "+r1+"each");
    }
    else
    {
      r1=(-1)*(b+Math.sqrt(d))/(2*a);
      r2=(-1)*(b-Math.sqrt(d))/(2*a);
      System.out.println("The roots are real and not equal and are "+r1+" and "+r2);
    }
  }
}
