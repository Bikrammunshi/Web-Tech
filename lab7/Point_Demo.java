/*
Implement a Point class for three dimensional point(x,y,z), include appropriate
constructors: Point(), Point(int,int,int), Point(Point), include following methods
i) float find_distance():distance from the origin
ii) float find_distance(int x1,int y1,int z1): distance between (x,y,z) and (x1,y1,z1).
iii) float find_distance(Point P1): disance between two points.
iv) boolean is_Equal(Point P1): equality between two points.
v) void show(): shows the description about the point objects.

Write down the application class Point_Demo where the unctionality of the Point class
is tested.
*/

import java.util.Scanner;
import java.lang.Math;
class Point
{
  int x;
  int y;
  int z;
  Point()
  {
    x=0;
    y=0;
    z=0;
  }
  Point(int x1,int y1,int z1)
  {
    x=x1;
    y=y1;
    z=z1;
  }
  Point(Point P)
  {
    x=P.x;
    y=P.y;
    z=P.z;
  }
  float find_distance()
  {
    return (float)Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
  }
  float find_distance(int x1,int y1,int z1)
  {
    return (float)Math.sqrt((Math.pow((x-x1),2)+Math.pow((y-y1),2)+Math.pow((z-z1),2)));
  }
  float find_distance(Point P)
  {
    return (float)Math.sqrt((Math.pow((x-P.x),2)+Math.pow((y-P.y),2)+Math.pow((z-P.z),2)));
  }
  boolean is_Equal(Point P)
  {
    float d1=(float)Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
    float d2=(float)Math.sqrt((Math.pow(P.x,2)+Math.pow(P.y,2)+Math.pow(P.z,2)));
    if(d1==d2)
      return true;
    else
      return false;
  }
  void show(Point P)
  {
    System.out.println("The distance of point 1 from origin is "+find_distance());
    System.out.println("The distance of point 1 from point (2,5,6) is "+find_distance(2,5,6));
    System.out.println("The distance of point 1 from point 2 is "+find_distance(P));
    if(is_Equal(P)==true)
      System.out.println("The points point 1 and point 2 are equidistant from each other");
    else
      System.out.println("The points point 1 and point 2 are not equidistant from each other");
  }
}

public class Point_Demo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the coordinates of a point 1.");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    Point p1=new Point(x,y,z);
    System.out.println("Enter the coordinates of a point 2.");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int z1=sc.nextInt();
    Point p2=new Point(x1,y1,z1);
    p1.show(p2);
  }
}
