class HairOil{
static String newoil="parachute";

public static void main(String abc[]){
System.out.println("Name of the oil is "+newoil);
newone();
newoil = "almond oil";
System.out.println("the oil after re-init");
System.out.println("oil name is "+newoil);
}
public static void newone(){
	newoil="almond oil";
}
}