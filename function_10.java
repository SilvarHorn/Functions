public class function_10
{
    public int digsum(int n)
    {
        int s=0,d=0;
        while(n>0)
        {
            d=n%10;
            n/=10;
            s+=d;
        }
        return s;
    }
    public int maxdig(int n)
    {
        int max=0,d=0;
        while(n>0)
        {
            d=n%10;
            n/=10;
            if (d>max)
            {
                max=d;
            }
        }
        return max;
    }
    public int mindig(int n)
    {
        int min=9,d=0;
        while(n>0)
        {
            d=n%10;
            n/=10;
            if (d<min)
            {
                min=d;
            }
        }
        return min;
    }
    public void show(int n)
    {
        int sum=digsum(n);
        int max=maxdig(n);
        int min=mindig(n);
        System.out.println("The sum of the digits: "+sum+"\nHighest digit: "+max+"\nLowest digit: "+min);
    }
}