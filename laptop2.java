class laptop2
{
int lp_cost;
String lp_brand;
String lp_name;
 laptop2(int x,String y,String z)
 {
 lp_cost=x;
 lp_brand=y;
 lp_name=z;
 return;
 }
 public static void main(String[] args)
 {
laptop2 s1=new laptop2(45600,"dell","hp");
 System.out.println( s1.lp_cost);
 System.out.println(s1.lp_brand);
 System.out.println(s1.lp_name);
 }
}