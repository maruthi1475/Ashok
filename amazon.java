class Amazon
{
	public static String Registration(String firstName, String lastName, String phoneNumber, String emailId, String address, String pincode)
	{
			String ref = null;
			boolean personValid = checkingPersonDetails(firstName, lastName, phoneNumber, address, emailId, pincode);
		if(personValid==true)
			ref="user registration successful";
		else
			ref="user registration unsuccessful";
		return ref ;
	}

	public static boolean checkingPersonDetails(String firstName, String lastName, String phoneNumber, String address, String emailId, String pincode)
	{
		boolean personValid = false;
		boolean isFirstName = false;
		boolean isLastName= false;
		boolean isPhoneNumber = false;
		boolean isAddress = false;
		boolean isEmailId = false;
		boolean isPincode = false;
		
		
		if(firstName!= null && firstName.length()<=10 && !firstName.isEmpty())
		{
			isFirstName = true;
		}
			else
		{
			System.out.println("firstName is too short");
		}
		if(lastName!=null && lastName.length()<=1)
		{
			isLastName = true;  
		}
			else
		{
			System.out.println("lastName is too long");
		}
		if(phoneNumber!= null && phoneNumber.length()>0 && phoneNumber.length()==10)
		{
			isPhoneNumber = true;
		}
			else
		{
			System.out.println("Invalid phoneNumber");
		}
		if(address!=null)
		{
			isAddress = true;
		}
			else
		{
			System.out.println("Address is invalid");
		}
		if(emailId!=null)
		{
			isEmailId = true;
		}
			else
		{
			System.out.println("Invalid mailId");
		}
		if(pincode!=null)
		{
			isPincode = true;
		}
			else
		{
			System.out.println("Invalid pincode");
		}
		if(isFirstName==true && isLastName==true && isPhoneNumber==true && isAddress==true && isEmailId==true && isPincode==true)
		{
			personValid=true;
		}
			return personValid ;

	}
}