class Triangle4
{
static double area( )
{
	int b=2;
	int h=9;
double result=0.5*b*h;
return(result);
}
}
class Triangle5
{
public static void main(String[] args)
{
double x= Triangle4.area();
System.out.println(x);
}
}