import java.util.*;
public class function_1
{
    public void even_odd(int n)
    {
        if (n%2==0)
        {
            System.out.println(n+" is even.");
        }
        else
        {
            System.out.println(n+" is odd.");
        }
    }
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        even_odd(n);
    }
}