class home2
{
int hm_cost;
String hm_color;
String hm_name;
 home2(int x,String y,String z)
 {
 hm_cost=x;
 hm_color=y;
 hm_name=z;
 return;
 }
 public static void main(String[] args)
 {
home2 s1=new home2(98580,"orange","ar");
 System.out.println( s1.hm_cost);
 System.out.println(s1.hm_color);
 System.out.println(s1.hm_name);
 }
}