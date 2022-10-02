import java.util.*;
public class function_3
{
    public void factorial(int n)
    {
        int f=1;
        for (int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println("Factorail of "+n+" is "+f);
    }
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        factorial(n);
    }
}