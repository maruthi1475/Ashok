class Vehicle{
static String myBike="Dio";

public static void main(String abc[]){
System.out.println("Name of the bike is "+myBike);
newBike();
myBike = "Ntorq";
System.out.println("the bike after re-init");
System.out.println("bike name is "+myBike);
}
public static void newBike(){
	myBike="Ntorq";
}
}