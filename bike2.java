class bike2
{
int bk_cost;
String bk_brand;
String bk_color;
 bike2(int x,String y, String z)
 {
 bk_cost=x;
 bk_brand=y;
 bk_color=z;
 return;
 }
 public static void main(String[] args)
 {
bike2 s1=new bike2(15900,"royal enfield","color");
 System.out.println( s1.bk_cost);
 System.out.println(s1.bk_brand);
 System.out.println(s1.bk_color);
 }
}