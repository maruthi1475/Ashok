class Footwear{
static String name="Nike sandals";

public static void main(String abc[]){
System.out.println("Name of the sandals is "+name);
newName();
name = "Puma sliders";
System.out.println("the name after re-init");
System.out.println("sandals name is "+name);
}
public static void newName(){
	name="Puma sliders";
}
}