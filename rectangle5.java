class rectangle4
{
static int area( )
{
int w=9;
int h=3;
int result=w*h;
return(result);
}
}
class rectangle5
{
public static void main(String[] args)
{
int y= rectangle4.area();
System.out.println(y);
}
}