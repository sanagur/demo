class Animal
{
void noise()
{
System.out.println("some noise");
}
}
class cat extends Animal
{
void noise()
{
System.out.println("meow meoww noise");
}
}
class dog extends Animal
{
void noise()
{
System.out.println(" bow boww noise");
}
}
class snake extends Animal
{
void noise()
{
System.out.println("hiss buss noise");
}
}
class Stimulator
{
static void ansim(Animal a1)
{
 a1.noise();
 }
 }
 public class Mainclass11
 {
  public static void main(String[] args)
  {
  cat c1=new cat();
  dog d1=new dog();
  snake s1=new snake();
    Stimulator.ansim(c1);
    Stimulator.ansim(d1);
    Stimulator.ansim(s1);
    }
 }