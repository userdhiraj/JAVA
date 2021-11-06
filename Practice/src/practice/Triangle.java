package practice;
import java.util.*;
import java.io.*;
import java.math.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
                    int x =sc.nextInt();
                    int y =sc.nextInt();
                    int z =sc.nextInt();
                   int sum=0;
                    sum=(x+y+z);
                    if (sum==180) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
    }
    
}
