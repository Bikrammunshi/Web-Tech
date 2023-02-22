//WAP to find the factorial of a number
class prg3
{
  public static void main(String args[])
  {
    int n=6;
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
