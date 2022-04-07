class titli8
{
public static void main(String[] args)
{
char[] arr=new char[3];
arr[0]=";
arr[1]='A';
arr[2]='A';
System.out.println("***********");
System.out.println("index\tvalue");
System.out.println("***********");
for( int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}