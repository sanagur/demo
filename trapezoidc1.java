class trapezoidc1
{
double area()
{
int a=7;
int b=5;
int h =2;
double result=0.5*(a+b)*h;
return result;
}
public static void main (String[] args)
{
trapezoidc1 f=new trapezoidc1();
double z=f.area();
System.out.println(z);
}
}