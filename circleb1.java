class circleb1
{
void area(int r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
public static void main(String[] args)
{
circleb1 c=new circleb1();
c.area(5);
}
}