class CarryBag{

		 //instance variable
		 String types;
		 String material;
		 int price;


		 //no args constructor
		 CarryBag(){
		 System.out.println("CarryBag constructor is invoked");
		 }

		//parameterized constructor
		CarryBag(String types, String material, int price){
		System.out.println("constructor is invoked");
		this.types=types;
		this.material=material;
		this.price=price;
		}



}