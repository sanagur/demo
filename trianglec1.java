class trianglec1
{
double area()
{
int b=9;
int h=3;
double result=0.5*b*h;
return result;
}
public static void main(String[] args)
{
trianglec1 c=new trianglec1();
double z=c.area();
System.out.println(z);
}
}