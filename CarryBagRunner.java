class CarryBagRunner{

 public static void main(String CarryBag[]){
 
 
	 //copy1
	 CarryBag cb1 = new CarryBag();
	 cb1.types= "Canvas carry bags";
	 cb1.material="plastic";
	 cb1.price=30;
	
	 System.out.println("types :"+ cb1.types);
	 System.out.println("material :"+cb1.material);
	 System.out.println("price :"+cb1.price);
	 
	 
	 //copy2
	 CarryBag cb2 = new CarryBag();
	 cb2.types="Paper carry bags";
	 cb2.material="paper";
	 cb2.price=35;

	 System.out.println("types :"+cb2.types);
	 System.out.println("material  :"+cb2.material);
	 System.out.println("price :"+cb2.price);
	
	 
	 //copy3
	 CarryBag cb3 = new CarryBag();
	 cb3.types="Jute Carry Bags";
	 cb3.material="jute";
	 cb3.price=40;

	 System.out.println("types :"+cb3.types);
	 System.out.println("material  :"+cb3.material);
	 System.out.println("price :"+cb3.price);
	
	 
	 //copy4
	 CarryBag cb4 = new CarryBag();
	 cb4.types="Cotton Carry Bags";
	 cb4.material="cotton";
	 cb4.price=45;

	 System.out.println("types :"+cb4.types);
	 System.out.println("material  :"+cb4.material);
	 System.out.println("price :"+cb4.price);
	 
	 
	 //copy5
	 CarryBag cb5 = new CarryBag();
	 cb5.types= "Non Woven Bags";
	 cb5.material="fibre";
	 cb5.price=50;

	 System.out.println("types :"+cb5.types);
	 System.out.println("material  :"+cb5.material);
	 System.out.println("price :"+cb5.price);
	
 
     //instantiated 6
     CarryBag cb6 = new CarryBag("event bags",  "polypropylene", 40);
     System.out.println("types :"+cb6.types);
     System.out.println("material  :"+cb6.material);
     System.out.println("price :"+cb6.price);
	
 
     //instantiated 7
     CarryBag cb7 = new CarryBag("jewellary bags", "polyethylene", 50);
     System.out.println("types :"+cb7.types);
     System.out.println("material  :"+cb7.material);
	 System.out.println("price :"+cb7.price);
     
 
 
 }
}