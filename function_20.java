public class function_20
{
    public static int hcf(int n,int m)
    {
        int min=Math.min(n,m),hcf=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0 && m%i==0)
            {
                hcf=i;
            }
        }
        return hcf;
    }
    public static int lcm(int n,int m)
    {
        int hcf=hcf(n,m);
        int lcm=(n*m)/hcf;
        return lcm;
    }
}