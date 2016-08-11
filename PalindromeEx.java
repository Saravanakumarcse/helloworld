class Palindrome
{
String original.reverse;
System.out.println("Enter given string palindrome or not ");
Scanner in=new Scanner(System.in);
original=in.nextLine();
int length=original.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+charAt(i);
}
if(original.equals(reverse))
{
System.out.println("Given string is palindrome");
}
else
{
System.out.println("Not palindrome ");
}
}
