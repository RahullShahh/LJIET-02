import java.util.*;
public class CircleDemo
{
    double radius;
    double circumference;
    double area;
    final double pi=3.14;
    void areaOfCircle(double radius)
    {
        double ans=pi*radius*radius;
        System.out.println("Area of the cirle with radius "+radius+" is "+ans);
    }
}
class CircleMainClass
{
    public static void main(String args[])
    {
        CircleDemo circle=new CircleDemo();
        Scanner sc= new Scanner(System.in);
        double r=sc.nextDouble();
        circle.areaOfCircle(r);
    }
}
