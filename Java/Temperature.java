//program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit//
import java.util.Scanner;
class Temperature
{
  public static void main(String args[])
{
   Scanner s= new Scanner (System.in);
System.out.println("Enter Temperature in Celsius");
int c=s.nextInt();
 double F=(c*1.8)+32;
System.out.println(F);
}
}