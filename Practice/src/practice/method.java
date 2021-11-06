package practice;
import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        System.out.println("Enter your name and age : ");
//        getName();
        System.out.println(getName() + " " + getAge());
    }
    public static String getName(){
          return new Scanner (System.in).nextLine();
//        String name = input.nextLine();
//        return input.nextLine();
}
    public static double getAge() {
        Scanner input = new Scanner (System.in);
        double age = input.nextDouble();
        return age;
//          return new Scanner (System.in).nextDouble();
    }
}