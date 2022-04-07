class trapezoid6
{
static double area( )
{
int a=9;
int b=8;
int h=4;
double result=0.5*(a+b)*h;
return(result);
}
}
class trapezoid5
{
public static void main(String[] args)
{
double y= trapezoid6.area();
System.out.println(y);
}
}