package practice;
import java.util.*;
interface AreaPeri
{
     double pi = 3.14;
     double Area(double x,double y);
     double Perimeter(double x,double y);
     
}
class rect implements AreaPeri
{
   public double Area(double x,double y)
{
    return(x*y);
}
    public double Perimeter(double x,double y)
    {
     return(2*(x+y));   
    }
}
class cir implements AreaPeri
{
    public double Area(double x,double y)
    {
     return(pi*x*x);   
    }
    public double Perimeter(double x,double y)
    {
     return(2*pi*x);   
    }
}
class tri implements AreaPeri
{
   public double Area(double x,double y)
{
    return(x*x/2);
}
    public double Perimeter(double x,double y)
    {
     return(2*(x+y));   
    }
}
 class Test3 {
     public static void main(String[] args) {
         rect r= new rect();
         cir c= new cir();
         tri t= new tri();
         AreaPeri a;
         a=r;
         System.out.println("The length of Rectangle are 10 and 20");
         System.out.println("Area of rectangle : " +a.Area(10,20));
         System.out.println("Perimeter of rectangle : " +a.Perimeter(10,20));
         
         a=c;
         System.out.println("The radius of circle is 15");
         System.out.println("Area of circle: " +a.Area(15,15));
         System.out.println("Perimeter of circle : " +a.Perimeter(15,15));
         a=t;
         System.out.println("The lengths of Triangle are 15 and 10");
         System.out.println("Area of triangle: " +a.Area(15,10));
         System.out.println("Perimeter of triangle: " +a.Perimeter(15,10));
     }
}
