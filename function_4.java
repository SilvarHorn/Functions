import java.util.*;
public class function_4
{
    public void reverse(int n)
    {
        int r=0,d=0,nc=n;
        while(nc>0)
        {
            d=nc%10;
            nc/=10;
            r=(r*10)+d;
        }
        System.out.println("Reverse of "+n+" is "+r);
    }
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        reverse(n);
    }
}