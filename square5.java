class square4
{
static int area( )
{
int a=3;
int result=a*a;
return(result);
}
}
class square5
{
public static void main(String[] args)
{
int f=square4.area();
System.out.println(f);
}
}