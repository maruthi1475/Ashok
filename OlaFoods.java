class OlaFoods
{
	public static int liquidItems(String juice)
	{
	int juicePrice = 00;
	if(juice == "Orange juice"){
			juicePrice = 65;
		}
		
	else if(juice == "Pomegranate juice"){
			juicePrice = 70;
		}
		
	else if(juice =="Apple juice"){
			juicePrice = 75;
		}
	
	else if(juice == "Pineapple Juice"){
			juicePrice = 65;
		}
		
	else if(juice == "Butterscotch"){
			juicePrice = 80;
		}
		
	else if(juice == "Cranberry juice"){
			juicePrice = 55;
		}
		
	else if(juice == "Watermelon juice"){
			juicePrice = 30;
		}
		
	else if(juice == "Beet juice"){
			juicePrice = 40;
		}
		
	else if(juice == "Sugar cane"){
			juicePrice = 30;
		}
		
	else if(juice == "Carrot juice"){
			juicePrice = 30;
		}
		
	else if(juice == "Grape juice"){
			juicePrice = 40;
		}
		else{
		System.out.println(juice+ "this juice is not currently available here");
		}
		return juicePrice;
	
	}
	
}
	
		
	