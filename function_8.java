import java.util.*;
public class function_8
{
    public boolean isPrime(int n)
    {
        int c=0;
        boolean b=false;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
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
    public void show(int n,int m)
    {
        boolean r=false,s=false;
        for (int i=n;i<=m;i++)
        {
            r=isPrime(i);
            s=isPrime(i+2);
            if (r==true && s==true)
            {
                System.out.println(i+" is a twin prime number.");
            }
        }
    }
}