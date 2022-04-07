class uber
{
 void book(int fare)
{
System.out.println("booked fare is : " +fare);
}
static void book(String name)
{
System.out.println("booked name is: " +name);
}
static void book(int fare ,String name)
{
System.out.println("booked fare &  name is : " +fare+ "  " +name );
}
static void book(String name,int fare)
{
System.out.println("booked name & fare is: " +name+ "  " +fare);
}
}
class MainClass5
{
public static void main(String[] args)
{
uber s1 = new uber();
 s1.book(250);
 s1.book("ra");
 s1.book(100,"ar");
 s1.book("asha",150);
}
}