class Blinkit
{
	public static int items(String oats)
	{
	int oatsCost = 00;
	if(oats == "saffola oats"){
			oatsCost = 65;
		}
		
	else if(oats == "mille instant high protein oats"){
			oatsCost = 226;
		}
		
	else if(oats =="pintola high protein oats"){
			oatsCost = 611;
		}
	
	else if(oats == "kwality classic masala oats"){
			oatsCost = 149;
		}
		
	else if(oats == "muscle blaze oats"){
			oatsCost = 612;
		}
		
	else if(oats == "Alphino oats"){
			oatsCost = 222;
		}
		
	else if(oats == "Doctor's choice oats"){
			oatsCost = 359;
		}
		
	else if(oats == "Bagrry oats"){
			oatsCost = 229;
		}
		
	else if(oats == "Tata soulfull cane"){
			oatsCost = 197;
		}
		
	else if(oats == "True elements oats"){
			oatsCost = 363;
		}
		else{
		System.out.println(oats+ "this oats is not currently available here");
		}
		return oatsCost;
	
	}
	
}
	
		
	