//Write a Java Program to Find Area of Square, Rectangle, and Circle using Method Overloading
import java.util.*;
public class over{
    public int area(int a)
    {
        return(a*a);
    }
    public int area(int a,int b)
    {
        return(a*b);
    }
    public float area(float r)
    {
        return((3.14f)*r*r);
    }
    public static void main(String[]args)
    {
        over o=new over();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        int a=s.nextInt();
        System.out.println("Enter the breadth");
        int b=s.nextInt();
        System.out.println("Enter the radius");
        float r =s.nextFloat();
        System.out.println("Area of the square");
        System.out.println(o.area(a));
        System.out.println("Area of rectangle");
        System.out.println(o.area(a,b));
        System.out.println("Area of circle");
        System.out.println(o.area(r));
    }
}
