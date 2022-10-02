import java.util.*;
public class function_13
{
    public boolean armstr(int n)
    {
        int nc=n,c=0,d=0,s=0;
        boolean b=false;
        while (nc>0)
        {
            nc/=10;
            c++;
        }
        nc=n;
        while (n>0)
        {
            d=n%10;
            n/=10;
            s=s+((int)Math.pow(d,c));
        }
        if (s== nc)
        {
            b=true;
        }
        return b;
    }
    public boolean palin(int n)
    {
        int d=0,r=0,nc=n;
        boolean b=false;
        while (n>0)
        {
            d=n%10;
            n/=10;
            r=(r*10)+d;
        }
        if (nc==r)
        {
            b=true;
        }
        return b;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        int n=sc.nextInt();
        boolean a=armstr(n);
        boolean b=palin(n);
        if (a==true && b==true)
        {
            System.out.println(n+" is both am Armstong and a Palindorme number.");
        }
        else
        {
            System.out.println(n+" is neither am Armstong nor a Palindorme number.");
        }
    }
}