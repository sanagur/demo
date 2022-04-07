class car2
{
int cr_cost;
String cr_name;
String cr_type;
 car2(int x,String y, String z)
 {
 cr_cost=x;
 cr_name=y;
 cr_type=z;
 return;
 }
 public static void main(String[] args)
 {
 car2 s1=new car2(419000,"honda","diesel");
 System.out.println( s1.cr_cost);
 System.out.println(s1.cr_name);
 System.out.println(s1.cr_type);
 }
}