class triangle9
{
double area()
{
int b=6;
int h=8;
double result=0.5*b*h;
return (result);
}
public static void main(String[] args)
{
double x =new triangle9().area();
System.out.println(x);
}
}