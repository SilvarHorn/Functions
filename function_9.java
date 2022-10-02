public class function_9
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
    public boolean isPalindrome(int n)
    {
        int r=0,d=0,nc=n;
        boolean b=false;
        while(nc>0)
        {
            d=nc%10;
            nc/=10;
            r=(r*10)+d;
        }
        if (r==n)
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
            s=isPalindrome(i);
            if (r==true && s==true)
            {
                System.out.println(i+" is a Pal Prime number.");
            }
        }
    }
}