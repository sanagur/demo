class Trapizoid2
{
 static void area(int a,int b, int h)
	{
	  double result=0.5*(a+b)*h;
	  System.out.println(result);
}
}
class Trapizoid3
{
	public static void main(String[] args)
{
	Trapizoid2.area(6,8,9);
}
}