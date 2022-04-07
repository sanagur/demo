class language
{
void comm()
{
System.out.println("some talk");
}
}
class telugu extends language
{
void comm()
{
System.out.println("koncham talk");
}
}
class kannada extends  language
{
void  comm()
{
System.out.println(" yen madati talk");
}
}
class hindi extends  language
{
void  comm()
{
System.out.println(" kaise ho talk");
}
}
class Audience
{
static void aull( language l1)
{
 l1. comm();
 }
 }
 public class Mainclass14
 {
  public static void main(String[] args)
  {
  telugu t1=new telugu();
  kannada k1=new kannada();
  hindi h1 =new hindi();
    Audience.aull(t1);
    Audience.aull(k1);
    Audience.aull(h1);
    }
 }