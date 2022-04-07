class titli9
{
public static void main(String[] args)
{
boolean[] arr=new boolean[3];
arr[0]=true;
arr[1]=false;
arr[2]=true;
System.out.println("***********");
System.out.println("index\tvalue");
System.out.println("***********");
for( int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}