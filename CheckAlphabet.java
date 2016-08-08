class CheckAlphabet
{
Scanner in=new Scanner(System.in);
System.out.println("Enter character");
String character=in.next();
if(character>=45&&character<=57){
System.out.println("Not Character");
}
else{
System.out.println("Character");
}
}
