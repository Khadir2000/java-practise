import java.util.Scanner;
 class Applications
{
 public static void main(String args [])
{
  int n,m,opt,sub,add,mul;
double div;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
m=sc.nextInt();
System.out.println("Enter second number");
n=sc.nextInt();
while(true)
{
  System.out.println("Enter 1 value for sub");
 System.out.println("Enter 2 value for sum");
System.out.println("Enter 3 value for mul");
System.out.println("Enter 4 value for div");
opt=sc.nextInt();
switch(opt)
{
case 1:
add= m + n;
System.out.println("Result:"+ add);
break;
case 2:
sub=m-n;
System.out.println("Result:"+sub);
break;
case 3:
mul= m*n;
System.out.println("Result:"+mul);
break;
case 4:
div=m%n;
System.out.println("Result:"+div);
break;
}
}
}
}