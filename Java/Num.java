import java.util.*;
class Num
 {
 public static void main(String[] args)
{ 
 Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
try{
System.out.println(a/b);
}catch(Exception e)
{ 
System.out.println(e);
System.out.println("Do not enter zero");}
finally{
System.out.println("zaid ko maro");
}
}
}