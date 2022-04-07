class ellipse
{
double area()
{
int a=4;
int b=5;
final double pi=3.142;
double result=pi*a*b;
return result;
}
}
class demo36
{
public static void main(String[] args)
{
ellipse a1=new ellipse();
double z=a1.area();
System.out.println(z);
}
}
