class HomeApplainces{
static String name="WashingMachine";

public static void main(String abc[]){
System.out.println("Name of the machine is "+name);
newMachine();
name = "owen";
System.out.println("the name after re-init");
System.out.println("machine name is "+name);
}
public static void newMachine(){
	name="owen";
}
}