class jiotv
{
void watch()
{
System.out.println("some entain");
}
}
class star extends jiotv
{
void watch()
{
System.out.println("danceplus entain");
}
}
class colors extends jiotv
{
void  watch()
{
System.out.println(" tarak mehta entain");
}
}
class zeetv extends jiotv
{
void  watch()
{
System.out.println(" did entain");
}
}
class People
{
static void tvpe( jiotv j1)
{
 j1. watch();
 }
 }
 public class Mainclass15
 {
  public static void main(String[] args)
  {
  star s1=new star();
  colors c1=new colors();
  zeetv z1 =new zeetv();
    People.tvpe(s1);
    People.tvpe(c1);
    People.tvpe(z1);
    }
 }