public class function_15
{
    public int revnum(int n)
    {
        int d=0,r=0;
        while (n>0)
        {
            d=n%10;
            n/=10;
            r=(r*10)+d;
        }
        return r;
    }
    public int digitsum(int n)
    {
        int d=0,s=0;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s+=d;
        }
        return s;
    }
}