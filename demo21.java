class circle
{
void area(int r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
}
class demo21
{
public static void main(String[] args)
{
circle a1=new circle();
a1.area(4);
}
}
