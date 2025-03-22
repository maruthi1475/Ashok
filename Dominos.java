class Dominos
{
	public static int pizza(String pizzaName)
	{
	int pizzaPrice = 00;
	if(pizzaName == "Margherita Pizza"){
			pizzaPrice = 250;
		}
		
	else if(pizzaName == "Double Cheese Margherita Pizza"){
			pizzaPrice = 300;
		}
		
	else if(pizzaName =="Peppy Paneer Pizza"){
			pizzaPrice = 350;
		}
	
	else if(pizzaName == "Mexican Green Wave Pizza"){
			pizzaPrice = 350;
		}
		
	else if(pizzaName == "Deluxe Veggie Pizza"){
			pizzaPrice = 400;
		}
		
	else if(pizzaName == "Veg Extravaganza Pizza"){
			pizzaPrice = 389;
		}
		
	else if(pizzaName == "Cheese n Corn Pizza"){
			pizzaPrice = 349;
		}
		
	else if(pizzaName == "Fresh Veggie Pizza"){
			pizzaPrice = 329;
		}
		
	else if(pizzaName == "Veggie Paradise Pizza"){
			pizzaPrice = 310;
		}
		
	else if(pizzaName == "Paneer Makhani Pizza"){
			pizzaPrice = 320;
		}
		
	else if(pizzaName == "Indi Tandoori Paneer Pizza"){
			pizzaPrice = 400;
		}
	
	else if(pizzaName == "Deluxe Veggie Pizza"){
			pizzaPrice = 340;
		}
		else{
		System.out.println(pizzaName+ "this pizza is not available here");
		}
		return pizzaPrice;
	
	}
	
}
	
		
	