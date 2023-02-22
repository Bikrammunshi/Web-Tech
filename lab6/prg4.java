//WAP  to convert time enter in seconds to hr min seconds
import java.util.Scanner;
class prg4
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the time in seconds ");
    int sec=sc.nextInt();int sec1=sec;
    int min=sec/60;
    int hr=min/60;
    while(sec>60)
    {
      min++;
      sec=sec-60;
    }
    while(min>60)
    {
      hr++;
      min=min-60;
    }
    System.out.println("The time in seconds is "+sec1+"seconds");
    System.out.println("The converted time is "+hr+"hour "+min+"minutes "+sec+"Seconds");
  }
}
