class trapezoid9
{
double area()
{
int a=9;
int b=3;
int h=5;
 double result=0.5*(a+b)*h;
 return result;
 }
 public static void main(String[] args)
 {
 double d=new trapezoid9().area();
 System.out.println(d);
 }
 }
