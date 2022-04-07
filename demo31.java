class circle
{
double area()
{
final double  pi=3.142;
int r=4;
double result=pi*r*r;
return result;
}
}
class demo31
{
public static void main(String[] args)
{
circle a1=new circle();
double z=a1.area();
System.out.println(z);
}
}