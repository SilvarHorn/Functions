public class function_19
{
    public int sumoffactors(int n)
    {
        int s=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public boolean isperfect(int n)
    {
        boolean b=false;
        int sf=sumoffactors(n);
        if (sf==n)
        {
            b=true;
        }
        return b;
    }
    public void allperfectnos()
    {
        boolean b=false;
        for (int i=1;i<100;i++)
        {
            b=isperfect(i);
            if (b==true)
            {
                System.out.println(i+" is a perfect number.");
            }
        }
    }
}