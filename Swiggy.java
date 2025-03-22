class Swiggy
{
	public static double food(String foodName)
	{
		double foodPrice = 0.0;
		if(foodName == "Masala Dose"){
			foodPrice=70.00;
		}
		else if(foodName == "Onion Dose"){
			foodPrice=75.00;
		}
		else if(foodName == "Rava Dose"){ 
			foodPrice=60.00;
		}
		else if(foodName == "Butter Masala Dose"){
			foodPrice=75.00;
		}
		else if(foodName == "Plain Dose"){
			foodPrice=55.00;
		}
		else if(foodName == "Set Dose"){
			foodPrice=50.00;
		}
		else if(foodName == "Benne Dose"){
			foodPrice=65.00;
		}
		else if(foodName == "Open Dose"){
			foodPrice=60.00;
		}
		else if(foodName == "Neer Dose"){
			foodPrice=60.00;
		}
		else if(foodName == "Paper Dose"){
			foodPrice=70.50;
		}
		else{
		System.out.println(foodName+ " this is not found");
		}
		return foodPrice;
	}
}