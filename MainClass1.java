class SBI
{
static void send(int accno)
{
System.out.println("sending accno: " +accno);
}
static void send(String name)
{
System.out.println("sending name: " +name);
}
static void send(int accno ,String name)
{
System.out.println("sending accno & name: " +accno+ "  " +name );
}
static void send(String name,int accno)
{
System.out.println("sending name & accno: " +name+ "  " +accno);
}
}
class MainClass1
{
public static void main(String[] args)
{
SBI.send(9900);
SBI.send("ABC");
SBI.send(9900,"ABC");
SBI.send("ABC",9900);
}
}