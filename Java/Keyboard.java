//Write a program in Java to input 5 numbers from keyboard and find their sum and average.//
import java.util.Scanner;
class Keyboard
{
 public static void main(String args[])
{
  Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
double sum;
sum=a+b+c+d+e;
System.out.println(sum);
double avg;
avg=sum/5;
System.out.println(avg);
}
}