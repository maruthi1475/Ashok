class Chemicals{

String name;
String chemicalFormula;
double weight;
String statesOfMatter;
boolean isReactive;
int ph;

 Chemicals(){
 this("water");
 System.out.println("Constructor without arg is invoked");
 }
 
 Chemicals(String name){
  this("H2O",18.01);
  this.name = name;
  System.out.println("Constructor with 1 String is invoked");
 }
 Chemicals(String chemicalFormula, double weight){
 this(18.01);
 this.chemicalFormula = chemicalFormula;
 this.weight = weight;
 System.out.println("Constructor with 1 double and 1 chemicalFormula is invoked");
 }
 Chemicals(double weight){
 this("liquid",true);
 this.weight = weight;
 System.out.println("Constructor with 1 double is invoked");
 }
 Chemicals(String statesOfMatter,boolean isReactive){
 this(7);
 this.statesOfMatter = statesOfMatter;
 this.isReactive = isReactive;
 System.out.println("Constructor with 1 String and 1 boolean is invoked");
 }
 Chemicals(int ph){
 this("water","H2O");
 this.ph = ph;
 System.out.println("Constructor with 1 int is invoked");
 }
 Chemicals(String name,String chemicalFormula){
 this.name = name;
 this.chemicalFormula = chemicalFormula;
 System.out.println("Constructor with 2 String is invoked");
 }
 
 public void display(){
 System.out.println("the name is "+name);
 System.out.println("the chemicalFormula is "+chemicalFormula);
 System.out.println("the weight is "+weight);
 System.out.println("the statesOfMatter is "+statesOfMatter);
 System.out.println("the isReactive is "+isReactive);
 System.out.println("the ph is "+ph);
 
 }

 

}