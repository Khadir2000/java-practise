//program to find the greatest number among three numbers//
import java.util.Scanner;
class Three
{
 public static void main(String args [])
{
  Scanner sc= new Scanner(System.in);
System.out.println("Enter first the value");
 int a=sc.nextInt();
System.out.println("Enter second value");
int b=sc.nextInt();
System.out.println("Enter third value");
int c=sc.nextInt();
   if (a>b && a>c)
      {
        System.out.println("Greatest number is:"+a);
               }
   else if (b>c)
    {
     System.out.println("Greatest number is:"+b);
}
else
{
  System.out.println("Greatest number is:"+c);
}
}
}  