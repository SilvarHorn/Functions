import java.util.*;
public class function_2
{
    public void prime(int n)
    {
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                c++;
            }
        }
        if (c==2)
        {
            System.out.println(n+" is prime.");
        }
        else
        {
            System.out.println(n+" is not prime.");
        }
    }
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        prime(n);
    }
}