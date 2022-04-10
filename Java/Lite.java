//Write a program in Java to display the cube of the number upto given an integer//
import java.util.Scanner;
class Lite
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
 for(int i=1;i<=6;i++)
   {
    for (int j=6;j>i;j--)
     {   
     System.out.print(" ");
      }   
        for(int k=1;k<=i;k++)
       {       
          System.out.print("*" ); 
        }
System.out.println(" ");
   }
 }
}

    