class Vase{

		 //instance variable
		 String shape;
		 String color;
		 int price;


		 //no args constructor
		 Vase(){
		 System.out.println("Vase constructor is invoked");
		 }

		//parameterized constructor
		Vase(String shape, String color, int price){
		System.out.println("constructor is invoked");
		this.shape=shape;
		this.color=color;
		this.price=price;
		}



}