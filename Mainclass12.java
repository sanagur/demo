class restaurants
{
void food()
{
System.out.println("some food");
}
}
class veg extends restaurants
{
void food()
{
System.out.println("palav  food");
}
}
class nonveg extends restaurants
{
void  food()
{
System.out.println(" chicken food");
}
}
class mixed extends restaurants
{
void  food()
{
System.out.println("birayani food");
}
}
class Customers
{
static void recus(restaurants r1)
{
 r1. food();
 }
 }
 public class Mainclass12
 {
  public static void main(String[] args)
  {
  veg v1=new veg();
  nonveg n1=new nonveg();
  mixed m1 =new mixed();
    Customers.recus(v1);
    Customers.recus(n1);
    Customers.recus(m1);
    }
 }