import java.util.*;
public class function_7
{
    public boolean isPrime(int x)
    {
        int c=0;
        boolean b=false;
        for (int i=1;i<=x;i++)
        {
            if (x%i==0)
            {
                c++;
            }
        }
        if (c==2)
        {
            b=true;
        }
        return b;
    }
    public void factor(int n)
    {
        boolean b=false;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                b=isPrime(i);
            }
            if (b==true)
            {
                System.out.println(i+" is a prime factor.");
            }
            b=false;
        }
    }
    public void show(int n)
    {
        factor(n);
    }
}