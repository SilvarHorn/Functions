public class function_16
{
    public int isprime(int n)
    {
        int c=0,r=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                c++;
            }
        }
        if (c==2)
        {
            r=1;
        }
        return r;
    }
    public void allPrimeNumebrs(int n)
    {
        int a=0;
        for (int i=1;i<=n;i++)
        {
            a=isprime(i);
            if (a==1)
            {
                System.out.println(i+" is a prime number.");
            }
        }
    }
}