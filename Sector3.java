class Sector2
{
static void area(int r)
{
double t=30.5;
double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sector3
{
  public static void main(String[] args)
{
 Sector2.area(4);
 }
 }