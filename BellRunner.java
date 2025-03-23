class BellRunner{

 public static void main(String bells[]){
 
 
	 //copy1
	 Bell bl1 = new Bell();
	 bl1.types="cow bells";
	 bl1.color="reddish";
	 bl1.price=320;
	
	 System.out.println("shpe :"+bl1.types);
	 System.out.println("color :"+bl1.color);
	 System.out.println("price :"+bl1.price);
	 
	 
	 //copy2
	 Bell bl2 = new Bell();
	 bl2.types="hand bells";
	 bl2.color="yellow";
	 bl2.price=359;

	 System.out.println("types :"+bl2.types);
	 System.out.println("color  :"+bl2.color);
	 System.out.println("price :"+bl2.price);
	
	 
	 //copy3
	 Bell bl3 = new Bell();
	 bl3.types="tea bells";
	 bl3.color="gold";
	 bl3.price=400;

	 System.out.println("types :"+bl3.types);
	 System.out.println("color  :"+bl3.color);
	 System.out.println("price :"+bl3.price);
	
	 
	 //copy4
	 Bell bl4 = new Bell();
	 bl4.types="chime bells";
	 bl4.color="white";
	 bl4.price=459;

	 System.out.println("types :"+bl4.types);
	 System.out.println("color  :"+bl4.color);
	 System.out.println("price :"+bl4.price);
	 
	 
	 //copy5
	 Bell bl5 = new Bell();
	 bl5.types="craft bells";
	 bl5.color="red";
	 bl5.price=545;

	 System.out.println("types :"+bl5.types);
	 System.out.println("color  :"+bl5.color);
	 System.out.println("price :"+bl5.price);
	
 
     //instantiated 6
     Bell bl6 = new Bell("farm bells",  "brown", 450);
     System.out.println("types :"+bl6.types);
     System.out.println("color  :"+bl6.color);
     System.out.println("price :"+bl6.price);
	
 
     //instantiated 7
     Bell bl7 = new Bell("garden bells", "silver", 500);
     System.out.println("types :"+bl7.types);
     System.out.println("color  :"+bl7.color);
	 System.out.println("price :"+bl7.price);
     
 
 
 }
}