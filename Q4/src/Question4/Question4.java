package Question4;
import java.util.*;
import java.util.*;
abstract class TwoDShape{
    int dim1,dim2;
    Scanner sc=new Scanner(System.in);
    abstract void area();   
}
class Rectangle extends TwoDShape
{
    void area()
    {
        System.out.println("Fnding area of Rectangle");
        System.out.println("Enter length and breadth : ");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
        System.out.println("The area of Rectangle is : " +(dim1 *dim2/2));
    } 
}
class Triangle extends TwoDShape
{
    void area(){
        System.out.println("Finding area of trinagnle: ");
        System.out.println("Enter base and height : ");
        dim1 = sc.nextInt();
        dim2 = sc.nextInt();
        System.out.println("Area of triangle : " + (dim1 * dim2));
}
}
public class Question4
{
    public static void main(String[] args)
    {
    Rectangle rec = new Rectangle();
    rec.area();
    Triangle tri = new Triangle();
    tri.area();
    }
}
    