class ArraySum
{
public static void main(String args[])
{
System.out.println("Array");

 System.out.println("start program");
 int array[];
array=new int[4];
array[0]=10;
array[1]=20;
array[2]=5;
array[3]=2;
int sum=0;
for(int i=0;i<array.length;i++)
{
sum+=array[i];
}
System.out.println(sum);
}
}
