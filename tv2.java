class tv2
{
int tv_cost;
String tv_name;
String tv_type;
 tv2(int x,String y, String z)
 {
 tv_cost=x;
 tv_name=y;
 tv_type=z;
 return;
 }
 public static void main(String[] args)
 {
 tv2 s1=new tv2(15000,"lg","andriod");
 System.out.println( s1.tv_cost);
 System.out.println(s1.tv_name);
 System.out.println(s1.tv_type);
 }
}