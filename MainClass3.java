class BookMyShow
{
static void book(int quantity)
{
System.out.println("booked quantity is : " +quantity);
}
static void book(String movie)
{
System.out.println("booked movie is: " +movie);
}
static void book(int quantity ,String movie)
{
System.out.println("booked quantity &  movie is : " +quantity+ "  " +movie );
}
static void book(String movie,int quantity)
{
System.out.println("booked movie & quantity is: " +movie+ "  " +quantity);
}
}
class MainClass3
{
public static void main(String[] args)
{
 BookMyShow.book(2);
 BookMyShow.book("spiderman");
 BookMyShow.book(2,"pushpa");
 BookMyShow.book("pushpa",3);
}
}