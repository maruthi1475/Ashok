class Lamp{
static String light="Study lamp";

public static void main(String abc[]){
System.out.println("type of the light is "+light);
newLight();
light = "Room light";
System.out.println("the type after re-init");
System.out.println("type of the light is "+light);
}
public static void newLight(){
	light="Room light";
}
}