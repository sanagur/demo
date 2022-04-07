class titli2
{
public static void main(String[] args)
{
short[] arr=new short[3];
arr[0]=12;
arr[1]=11;
arr[2]=24;
System.out.println("***********");
System.out.println("index\tvalue");
System.out.println("***********");
for( int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}