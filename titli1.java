class titli1
{
public static void main(String[] args)
{
byte[] arr=new byte[3];
arr[0]=123;
arr[1]=121;
arr[2]=124;
System.out.println("***********");
System.out.println("index\tvalue");
System.out.println("***********");
for( byte i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}