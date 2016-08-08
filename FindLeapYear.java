class FindLeapYear
{
int year;
System.out.println("Enter given year");
Scanner in=new Scanner(System.in);
 year=in.nextInt();
if(year%400==0)
{
System.out.println("Leap year");
}
else if(year%100==0){
System.out.println("Not Leap year");
}
else if(year%4==0)
{
System.out.println("Leap Year");
}
else
{
System.out.println("Not");
}
}
