class Instagram
{
static void send(int no)
{
System.out.println("sending no: " +no);
}
static void send(String comment)
{
System.out.println("sending name: " +comment);
}
static void send(int no ,String comment)
{
System.out.println("sending no & comment: " +no+ "  " +comment );
}
static void send(String comment,int no)
{
System.out.println("sending comment & no: " +comment+ "  " +no);
}
}
class MainClass2
{
public static void main(String[] args)
{
Instagram.send(1);
Instagram.send("cute");
Instagram.send(2,"nice");
Instagram.send("nice",3);
}
}