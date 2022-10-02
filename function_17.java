public class function_17
{
    public boolean isprime(int n)
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
    public int opposite(int n)
    {
        int r=0,d=0,nc=n;
        while(nc>0)
        {
            d=nc%10;
            nc/=10;
            r=(r*10)+d;
        }
        return r;
    }
    public boolean ispalindrome(int n)
    {
        int r=opposite(n);
        boolean b=false;
        if (n==r)
        {
            b=true;
        }
        return b;
    }
    public void allpalindromeno(int n)
    {
        boolean pr=false,pa=false;
        for (int i=1;i<=n;i++)
        {
            pr=isprime(i);
            pa=ispalindrome(i);
            if (pr==true && pa==true)
            {
                System.out.println(i+" is a prime palindrome number.");
            }
        }
    }
}