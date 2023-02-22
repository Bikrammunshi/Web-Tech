//WAP to find the sum of digits of a number
class prg6
{
  public static void main(String args[])
  {
    int n=9707;
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
