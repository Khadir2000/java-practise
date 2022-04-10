//Write a Java program to get a number from the user and print whether it is positive or negative.//
import java.util.Scanner;
class Number
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 int i=sc.nextInt();
if(i>0)
 { 
   System.out.println("It is positive Number");
 }
 else if(i<0)
{ 
  System.out.println("It is negative Number");
}
}
}