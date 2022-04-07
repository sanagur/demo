class circlec1
{
double area()
{
final double pi=3.142;
int r=2;
double result=pi*r*r;
return result;
}
public static void main(String[] args)
{
circlec1 g=new circlec1();
double y=g.area();
System.out.println(y);
}
}