class VaseRunner{

 public static void main(String Vase[]){
 
 
	 //copy1
	 Vase vs1 = new Vase();
	 vs1.shape="Mason Jar";
	 vs1.color="orange";
	 vs1.price=3000;
	
	 System.out.println("shpe :"+vs1.shape);
	 System.out.println("color :"+vs1.color);
	 System.out.println("Vaseerial :"+vs1.price);
	 
	 
	 //copy2
	 Vase vs2 = new Vase();
	 vs2.shape="Milk Bottle";
	 vs2.color="yellow";
	 vs2.price=3500;

	 System.out.println("shape :"+vs2.shape);
	 System.out.println("color  :"+vs2.color);
	 System.out.println("Vaseerial :"+vs2.price);
	
	 
	 //copy3
	 Vase vs3 = new Vase();
	 vs3.shape="Rustic Vase";
	 vs3.color="grey";
	 vs3.price=4000;

	 System.out.println("shape :"+vs3.shape);
	 System.out.println("color  :"+vs3.color);
	 System.out.println("Vaseerial :"+vs3.price);
	
	 
	 //copy4
	 Vase vs4 = new Vase();
	 vs4.shape="Cylinder Vase";
	 vs4.color="blue";
	 vs4.price=4500;

	 System.out.println("shape :"+vs4.shape);
	 System.out.println("color  :"+vs4.color);
	 System.out.println("Vaseerial :"+vs4.price);
	 
	 
	 //copy5
	 Vase vs5 = new Vase();
	 vs5.shape=" Bouquet Vase";
	 vs5.color="marron";
	 vs5.price=5000;

	 System.out.println("shape :"+vs5.shape);
	 System.out.println("color  :"+vs5.color);
	 System.out.println("Vaseerial :"+vs5.price);
	
 
     //instantiated 6
     Vase vs6 = new Vase("Cube Vase",  "brown", 4000);
     System.out.println("shape :"+vs6.shape);
     System.out.println("color  :"+vs6.color);
     System.out.println("Vaseerial :"+vs6.price);
	
 
     //instantiated 7
     Vase vs7 = new Vase("Ceramic Vase", "green", 5000);
     System.out.println("shape :"+vs7.shape);
     System.out.println("color  :"+vs7.color);
	 System.out.println("Vaseerial :"+vs7.price);
     
 
 
 }
}