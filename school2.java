class school2
{
String sc_name;
char sc_grade;
int sc_strength;
 school2(String x,char y,int z)
 {
 sc_name=x;
 sc_grade=y;
 sc_strength=z;
 return;
 }
 public static void main(String[] args)
 {
 school2 s1=new school2("mgm",'A',400);
 System.out.println( s1.sc_name);
 System.out.println(s1.sc_grade);
 System.out.println(s1.sc_strength);
 }
}