class sectorc1
{
double area()
{
int r= 5;
double t=30.5;
double result=0.5*r*r*t;
return result;
}
public static void main(String[] args)
{
sectorc1 g=new sectorc1();
double h=g.area();
System.out.println(h);
}
}