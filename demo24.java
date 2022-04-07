class trapezoid
{
void area(int a,int b,int h)
{
double result=0.5*(a+b)*h;
System.out.println(result);
}
}
class demo24
{
public static void main(String[] args)
{
trapezoid a1=new trapezoid();
a1.area(4,5,9);
}
}
