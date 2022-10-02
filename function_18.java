public class function_18
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
    public void show()
    {
        boolean r=false,s=false;
        for (int i=1;i<=100;i++)
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