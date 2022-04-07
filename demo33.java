class triangle
{
double area()
{
int h=4;
int b=5;
double result=0.5*b*h;
return result;
}
}
class demo33
{
public static void main(String[] args)
{
triangle a1=new triangle();
double z=a1.area();
System.out.println(z);
}
}
