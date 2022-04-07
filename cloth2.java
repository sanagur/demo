class cloth2
{
String ct_color;
int ct_cost;
char ct_size;
 cloth2(String x,int y,char z)
 {
 ct_color=x;
 ct_cost=y;
 ct_size=z;
 return;
 }
 public static void main(String[] args)
 {
cloth2 s1=new cloth2("blue",546,'S');
 System.out.println( s1.ct_color);
 System.out.println(s1.ct_cost);
 System.out.println(s1.ct_size);
 }
}