import java.util.*;
import java.io.*;
import java.math.*;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			BigInteger fact = BigInteger.ONE;
			for(int i=2;i<=n;i++){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}
}