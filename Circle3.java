class Circle2
{
static void area(int r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
}
class Circle3
{
public static void main(String[] args)
{
Circle2.area(9);
}
}
