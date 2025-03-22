class Wristwear{
static String name="Casio";

public static void main(String abc[]){
System.out.println("Name of the watch is "+name);
newName();
name = "Rolex";
System.out.println("the name after re-init");
System.out.println("watch name is "+name);
}
public static void newName(){
	name="Rolex";
}
}