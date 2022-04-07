class sector
{
double area()
{
	int r=3;
double t=30.5;
double result=0.5*r*r*t;
return result;
}
}
class demo38
{
public static void main(String[] args)
{
sector a1=new sector();
double z=a1.area();
System.out.println(z);
}
}
