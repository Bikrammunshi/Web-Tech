//WAP  to onvert integer to binary
import java.util.Scanner;
class prg8
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println(Integer.toBinaryString(n));
  }
}
