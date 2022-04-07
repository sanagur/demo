class circle9
{
double area()
{
final double pi=3.142;
int r=3;
double result=pi*r*r;
return result;
}
public static void main(String[] args)
{
double g=new circle9().area();
System.out.println(g);
}
}