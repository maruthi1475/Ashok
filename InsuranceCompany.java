class InsuranceCompany
{
	public static double search(String insuranceName)
	{
		double termPrice = 0.0;
		if(insuranceName == "ICICI prudential life Insurance"){
			termPrice=9000.70;
		}
		else if(insuranceName == "LIC"){
			termPrice=8999.99;
		}
		else if(insuranceName == "Future Generali India Life Insurance"){ 
			termPrice=8800.66;
		}
		else if(insuranceName == "Bajaj life Insurance"){
			termPrice=8100.87;
		}
		else if(insuranceName == "Bharati AXA life Insurance"){
			termPrice=8230.99;
		}
		else if(insuranceName == "HDFC life Insurance"){
			termPrice=8340.43;
		}
		else if(insuranceName == "Max life Insurance"){
			termPrice=8560.45;
		}
		else if(insuranceName == "Bhirla life Insurance"){
			termPrice=4560.34;
		}
		else if(insuranceName == "Kotak Mahindra life Insurance"){
			termPrice=8980.67;
		}
		else if(insuranceName == "IDFC life Insurance"){
			termPrice=8070.50;
		}
		else{
		System.out.println(insuranceName+ " this is not found");
		}
		return termPrice;
	}
}