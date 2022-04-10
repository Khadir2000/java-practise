class Student
{
 int n;
String name;
Student(int i,String s)
 {
  n=i;
  name=s;
 }
void display()
 {
  System.out.print(n+" "+name);
 }
public static void main (String args [])
{
  Student s1 =new Student(1,"ABC");
s1.display();
}
}
