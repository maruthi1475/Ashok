class MaxFashion{
public static String signUp(String firstName, String lastName, String phoneNumber, String emailId, String dob, String gender)
{
String ref = null;
boolean userValid = validateUserProfile(firstName, lastName, phoneNumber, dob, emailId, gender);
if(userValid==true)
ref="user sign up successful";
else
ref="user sign up unsuccessful";
return ref ;
}

public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String emailId, String gender)
{
	boolean userValid = false;
    boolean isFirstName = false;
	boolean isLastName= false;
    boolean isPhoneNumber = false;
	boolean isDob = false;
	boolean isEmailId = false;
	boolean isGender = false;
if(firstName!= null && firstName.length()<=10)
{
isFirstName = true;
}
else
	{
System.out.println("Invalid firstName");
}
if(lastName!=null && lastName.length()<=1)
{
isLastName = true;  
}
else
{
System.out.println("Invalid lastName");
}
if(phoneNumber!= null && phoneNumber.length()>0 && phoneNumber.length()==10)
{
isPhoneNumber = true;
}
else
{
System.out.println("Invalid phoneNumber");
}
if(dob!=null)
{
isDob = true;
}
else
{
System.out.println("Invalid dob");
}
if(emailId!=null)
{
isEmailId = true;
}
else
{
System.out.println("Invalid mailId");
}
if(gender!=null)
{
isGender = true;
}
else
{
System.out.println("Invalid gender");
}
if(isFirstName==true && isLastName==true && isPhoneNumber==true && isDob==true && isEmailId==true && isGender==true)
{
	userValid=true;
}
return userValid ;

}
}