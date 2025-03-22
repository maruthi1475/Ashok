class Machine{

static String brand = "Haier";
static String dimension = "69.7D x 90.5W x 177.5H Centimeters";
static String capacity = "600 litres";
static String configuration = "side-by-side";
static String colour = "navy blue";
public static void main (String args[]){
//brand="LG";
//dimension="69.8D x 90.6W x 177H Centimeters";
//capacity="700 litres";
//configuration="side-on-side";
//colour="black";
fridge();
System.out.println("the brand name is "+brand);
System.out.println("the dimension of the fridge is "+dimension);
System.out.println("the capacity of the fridge is "+capacity);
System.out.println("the configurationof the fridge  is "+configuration);
System.out.println("the colour of the item is "+colour);
}
public static void fridge(){
brand="LG";
dimension="69.8D x 90.6W x 177H Centimeters";
capacity="700 litres";
configuration="side-on-side";
colour="black";

}
}