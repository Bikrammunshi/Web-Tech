//WAP  to convert temperature from celcius to farenheit and kelvin
import java.util.Scanner;
class prg5
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in celcius");
    double cel=sc.nextDouble();
    double faren=(1.8*cel)+32;
    double kel=cel+273.15;
    System.out.println("The temperature in celcius "+cel);
    System.out.println("The temperature in farenheit "+faren);
    System.out.println("The temperature in kelvin "+kel);
  }
}
