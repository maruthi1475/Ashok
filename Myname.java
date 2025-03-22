class Myname{
static String myName="Ashok";

public static void main(String abc[]){
System.out.println("My name is "+myName);
newName();
myName = "Maruthi";
System.out.println("the name after re-init");
System.out.println("my name is "+myName);
}
public static void newName(){
	myName="Maruthi";
}
}