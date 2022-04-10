class Employe
{
 String name;
int emp_id;
Employe(String name,int emp_id)
{
  this.name=name;
this.emp_id=emp_id;
}
public static void main (String [] args)
{
Employe e1=new Employe("ram",1);
Employe e2=new Employe("abc",2);
System.out.println(e1.name+""+e1.emp_id);
System.out.println(e2.name+""+e2.emp_id);
}
}