class sector
{
void area(int r)
{
double t=30.5;
double result=0.5*r*r*t;
System.out.println(result);
}
}
class demo28
{
public static void main(String[] args)
{
sector a1=new sector();
a1.area(5);
}
}
