class SumOfNatural
{
public static void main(String args[])
{
int x,i=1;
System.out.println("Enter Given Number");
Scanner in=new Scanner(System.in);
x=in.nextInt();
int sum=0;
while(i<=x)
{
sum=sum+i;
}
System.out.println(sum);
}
