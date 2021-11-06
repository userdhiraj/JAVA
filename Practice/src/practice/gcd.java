package practice;
public class gcd {

int gcd(int m,int n)
{
    while(m!=n)
    {
        if(m>n)
            m=m-n;
        else
            n=n-m;
    }
    return n;
}
    public static void main(String[] args) {
        gcd k= new gcd();
        System.out.println(k.gcd(25,15));
    }
}    
