class Myphone{
static String myPhone="Redmi note 6a";

public static void main(String abc[]){
System.out.println("My 1st phone is "+myPhone);
newPhone();
myPhone = "IQOO Z3";
System.out.println("the phone after re-init");
System.out.println("my current phone is "+myPhone);
}
public static void newPhone(){
	myPhone="IQOO Z3";
}
}