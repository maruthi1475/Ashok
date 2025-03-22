class UberEats
{
	public static int desserts(String sweets)
	{
	int sweetsPrice = 00;
	if(sweets == "Foam cake"){
			sweetsPrice = 25;
		}
		
	else if(sweets == "Fruitcake"){
			sweetsPrice = 30;
		}
		
	else if(sweets =="Cupcake"){
			sweetsPrice = 35;
		}
	
	else if(sweets == "Laddu"){
			sweetsPrice = 35;
		}
		
	else if(sweets == "Butterscotch"){
			sweetsPrice = 40;
		}
		
	else if(sweets == "Milk chocolate"){
			sweetsPrice = 39;
		}
		
	else if(sweets == "Choco pie"){
			sweetsPrice = 34;
		}
		
	else if(sweets == "Choco pie"){
			sweetsPrice = 32;
		}
		
	else if(sweets == "Sugar cake"){
			sweetsPrice = 30;
		}
		
	else if(sweets == "Kaju katli"){
			sweetsPrice = 30;
		}
		
	else if(sweets == "Peanut butter cookie"){
			sweetsPrice = 40;
		}
	
	else if(sweets == "Cheesecake"){
			sweetsPrice = 34;
		}
		else{
		System.out.println(sweets+ "this sweet is not currently available here");
		}
		return sweetsPrice;
	
	}
	
}
	
		
	