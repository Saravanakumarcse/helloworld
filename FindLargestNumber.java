class FindLargestNumber
{
int x,y,z;
System.out.println("Enter given number");
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
if(x>y && x>z)
{
System.out.println("x is Larger");
}
else if(y>z && y>x)
{
System.out.println("y is larger");
}
else if(z>x && z>y)
{
System.out.println("z is larger");
}
else
{
System.out.println("Number invalid");
}
}
