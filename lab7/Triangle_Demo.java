/*
Implement a class Triangle having data members a,b,c.
i) set_Dim():initialize the data members.
ii) boolean is_Triangle(): is used to check whether the sides are permissible values to form triangle or not.
iii) float find_area(): this method is only invoked if is_Triangle is true .
iv)  float find_perimeter(): this method is only invoked if is_Triangle is true.
v)  void show(): is used to display the sides area and perimeter of the triangle.

write down the application class Triangle_Demo where the functionality of the Triangle class is tested.
*/

import java.util.Scanner;
import java.lang.Math;
 class Triangle
{
  float a;
  float b;
  float c;
  float area;
  float perimeter;

  void set_Dim()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sides of the triangle: \n");
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
  }

  boolean is_Triangle()
  {
    if(a+b>c || b+c>a || a+c>b)
      return true;
    else
      return false;
  }

  float find_perimeter()
  {
    return a+b+c;
  }

  float find_area()
  {
    float s=find_perimeter()*0.5f;
    return ((float)Math.sqrt(s*(s-a)*(s-b)*(s-b)));
  }

  void show()
  {
    if (is_Triangle()==true)
    {
      perimeter=find_perimeter();
      area=find_area();
      System.out.println("The perimeter is of the triangle is "+perimeter);
      System.out.println("The area of the triangle is "+area);
    }
    else
      System.out.println("The figure is not a triangle hence the area and the perimeter cannot be found...");
  }
}

public class Triangle_Demo 
{
  public static void main(String args[])
  {
    Triangle obj=new Triangle();
    obj.set_Dim();
    obj.show();
  }
}
