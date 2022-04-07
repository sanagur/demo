class phonpe
{
void amount()
{
System.out.println("some trans");
}
}
class redbus extends phonpe
{
void amount()
{
System.out.println(" travel trans");
}
}
class swiggy extends phonpe
{
void  amount()
{
System.out.println(" food trans");
}
}
class amazon extends phonpe
{
void  amount()
{
System.out.println(" product trans");
}
}
class Users
{
static void usepe( phonpe p1)
{
 p1. amount();
 }
 }
 public class Mainclass16
 {
  public static void main(String[] args)
  {
   redbus r1 =new redbus();
   swiggy s1=new swiggy();
  amazon a1 =new amazon();
    Users.usepe(r1);
    Users.usepe(s1);
    Users.usepe(a1);
    }
 }