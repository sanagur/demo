class sector9
{
double area()
{
int r=5;
double t=30.5;
double result=0.5*r*r*t;
return result;
}
public static void main(String[] args)
{
double x=new sector9().area();
System.out.println(x);
}
}