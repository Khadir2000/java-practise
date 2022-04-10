 import java.util.Scanner;
class Area
{
 float calculate()
{
 Scanner sc=new Scanner(System.in);
float r=sc.nextFloat();
return 3.14f*r*r;
}
}
 class Main1
{
 public static void main(String args[])
{
 Area a1= new Area();
System.out.println(a1.calculate());
}
}