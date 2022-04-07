class employee2
{
int emp_id;
int emp_sal;
char emp_grade;
 employee2(int x,int y,char z)
 {
 emp_id=x;
 emp_sal=y;
 emp_grade=z;
 return;
 }
 public static void main(String[] args)
 {
employee2 s1=new employee2(234,4500,'A');
 System.out.println( s1.emp_id);
 System.out.println(s1.emp_sal);
 System.out.println(s1.emp_grade);
 }
}