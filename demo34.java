class trapezoid
{
double area()
{
int a=6;
int h=4;
int b=5;
double result=0.5*(a+b)*h;
return result;
}
}
class demo34
{
public static void main(String[] args)
{
trapezoid a1=new trapezoid();
double z=a1.area();
System.out.println(z);
}
}
