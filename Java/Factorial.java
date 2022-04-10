import java.util.*;
class Factorial
{
 static int f=1;
static void fact(int n)
{
int i=1;
 for (i=1; i<=n; i++);
      {
         f=f*i;
      }
System.out.println(f);
}
public static void main (String args[])
{
  System.out.println("Enter number");
 Scanner sc=new Scanner (System.in);
 fact(sc.nextInt());
}
}