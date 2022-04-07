class trapezoid8
{
void area(int a,int b,int h)
{
double result=0.5*(a+b)*h;
System.out.println(result);
}
public static void main(String[] args)
{
new trapezoid8().area(2,4,5);
}
}