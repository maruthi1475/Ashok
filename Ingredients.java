class Ingredients{
static String name="MysoreSandal";

public static void main(String abc[]){
System.out.println("Name of the soap is "+name);
newName();
name = "Park avenue";
System.out.println("the name after re-init");
System.out.println("soap name is "+name);
}
public static void newName(){
	name="Park avenue";
}
}