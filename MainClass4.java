class Amazon
{
static void book(int quantity)
{
System.out.println("booked quantity is : " +quantity);
}
static void book(String name)
{
System.out.println("booked name is: " +name);
}
static void book(int quantity ,String name)
{
System.out.println("booked quantity &  name is : " +quantity+ "  " +name );
}
static void book(String name,int quantity)
{
System.out.println("booked name & quantity is: " +name+ "  " +quantity);
}
}
class MainClass4
{
public static void main(String[] args)
{
 Amazon.book(2);
 Amazon.book("phone");
 Amazon.book(1,"headphone");
 Amazon.book("laptop",1);
}
}