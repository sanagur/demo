class mobile2
{
int mb_cost;
String mb_name;
String mb_color;
 mobile2(int x,String y, String z)
 {
 mb_cost=x;
 mb_name=y;
 mb_color=z;
 return;
 }
 public static void main(String[] args)
 {
 mobile2 s1=new mobile2(19000,"mi","black");
 System.out.println("mobile2 cost" +s1.mb_cost);
 System.out.println("mobile2 name"+s1.mb_name);
 System.out.println("mobile2 color"+s1.mb_color);
 }
}