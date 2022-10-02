import java.util.*;
public class function_5
{
    public int sum(int x,int y,int z)
    {
        int sum=x+y+z;
        return sum;
    }
    public void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter three number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int sum=sum(x,y,z);
        System.out.println("Sum of the numbers are "+sum);
    }
}