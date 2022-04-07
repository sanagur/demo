class birds
{
void noise()
{
System.out.println("some noise");
}
}
class parrot extends birds
{
void noise()
{
System.out.println("chu chuu noise");
}
}
class crow extends  birds
{
void  noise()
{
System.out.println(" kaw kaww noise");
}
}
class koel extends  birds
{
void  noise()
{
System.out.println("khau khauu noise");
}
}
class Nature
{
static void bina( birds b1)
{
 b1. noise();
 }
 }
 public class Mainclass13
 {
  public static void main(String[] args)
  {
  parrot p1=new parrot();
  crow c1=new crow();
  koel k1 =new koel();
    Nature.bina(p1);
    Nature.bina(c1);
    Nature.bina(k1);
    }
 }