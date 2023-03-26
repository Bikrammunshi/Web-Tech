class Parent 
{
   
    public Parent(int i, int j)
    {
        System.out.println("Parent class called");
    }
}
 
// Child Class
class Child extends Parent
{
   
    public Child()
    {
        super(10, 20);
        System.out.println("calling parent with child");
    }
}
 
public class paramtereized
 {
    public static void main(String[] args)
    {
        Child obj = new Child();
    }
}
