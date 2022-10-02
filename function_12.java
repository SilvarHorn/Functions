import java.util.*;
public class function_12
{
    public void inputs()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int n=0,c=0;
        boolean b=false;
        for (int i=1;i<=10;i++)
        {
            n=sc.nextInt();
            b=isKrishnamurty(n);
            if (b==true)
                c++;
        }
        System.out.println("The number of Krishnamutry numbers is "+c);
    }
    public int factorial(int a)
    {
        int f=1;
        for (int i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }
    public boolean isKrishnamurty(int a)
    {
        int c=a,d=0,f=0,s=0;
        boolean b=false;
        while (a>0)
        {
            d=a%10;
            f=factorial(d);
            s+=f;
            a/=10;
        }
        if (s==c)
        {
            b=true;
        }
        return b;
    }
}