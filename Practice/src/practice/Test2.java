package practice;
interface I1
{
    void print();
}
interface I2 extends I1
    {
        void sum();
    }
class C1 implements I1{
    public void show()
    {
        System.out.println("10");
    }
    public void print()
    {
        System.out.println("20");
    }
}
 class Test2 {
          public static void main(String[] args) {
         C1 obj=new C1();
         obj.print();
         obj.show();
         
     }
}
