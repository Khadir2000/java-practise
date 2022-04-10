//Check whether the triangle is equilateral//
import java.util.Scanner;
class Angal
{
 public static void main(String args[])
{
 Scanner sc=new Scanner (System.in);
System.out.println("Enter first side:");
double a=sc.nextDouble();
System.out.println("Enter second side:");
double b=sc.nextDouble();
System.out.println("Enter third side:");
double c=sc.nextDouble();
 if (a==b && b==c && a==60)
 {
   System.out.println("triangle is equilateral");
 }
 else 
{
  System.out.println("Triangle is not equilateral");
}
}
}
 

