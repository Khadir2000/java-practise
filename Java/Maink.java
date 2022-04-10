import java.util.Scanner;
class pattern
{
void pyramid()
{
for(int i=1; i<=4;i++)
   {
     for(int j=1;j<=i;j++)
        { 
          System.out.print("*");
        }
     System.out.println(" ");
   }
}
} 
class second
{
void leftpyramid()
{
for(int l=1; l<=4;l++)
   {
     for(int k=1;k<=l-l;k++)
        { 
          System.out.print("*");
        }
     System.out.println(" ");
   }
}
} 
class Maink
{
  public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
pattern p=new pattern();
second a=new second();
int n=sc.nextInt();
   switch(n) 
   { 
      case 1:p.pyramid();
       
     case 2:a.leftpyramid();
      
     default: System.out.println("No Methodes");
}
}
}
 

  