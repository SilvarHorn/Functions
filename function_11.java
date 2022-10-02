public class function_11
{
    public int reverse(int n)
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
    public boolean pal(int n)
    {
        boolean b=false;
        int a=reverse(n);
        if (n==a)
        {
            b=true;
        }
        return b;
    }
    public void show(int n)
    {
        boolean b=false;
        b=pal(n);
        if (b==true)
        {
            System.out.println(n+" is a palindrome number.");
        }
        else
        {
            System.out.println(n+" is not a palindrome number.");
        }
    }
}