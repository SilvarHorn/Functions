import java.util.*;
public class function_6
{
    public int isTriangle(int x,int y,int z)
    {
        int p=0;
        if ((x+y)>z && (x+z)>y && (y+z)>x)
        {
            p=1;
        }
        return p;
    }
    public void typeTriangle(int x,int y,int z)
    {
        if (x==y && y==z)
        {
            System.out.print("It is an Equilatoral Triangle.");
        }
        else if (x!=y && y!=z)
        {
            System.out.print("It is a Scalene Traingle.");
        }
        else
        {
            System.out.print("It is an Isoscles Triangle.");
        }
    }
    public void call()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int r=isTriangle(a,b,c);
        if (r==1)
        {
            System.out.println("Triangle is Possible.");
            typeTriangle(a,b,c);
        }
        else
        {
            System.out.println("Traingle is not possible.");
        }
    }
}