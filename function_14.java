public class function_14
{
    public int powe(int n,int p)
    {
        int po=1;
        for (int i=1;i<=p;i++)
        {
            po*=n;
        }
        return po;
    }
    public void displ(int n,int x)
    {
        int s=1,p=0;
        for (int i=3;i<=n;i+=2)
        {
            p=powe(x,i);
            s+=p;
        }
        System.out.println("The sum of the series is "+s);
    }
}