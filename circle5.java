class circle4
{
static double area()
{
int r=3;
final double pi=3.142;
double result=pi*r*r;
return(result);
}
}
class circle5
{
public static void main(String[] args)
{
double f = circle4.area();
System.out.println(f);
}
}