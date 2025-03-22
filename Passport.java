class Passport{
public static String Registration(String registration, String passportOffice, String givenName, String surName, String dob,String emailId, String loginId, String password)
{
String ref = null;
boolean flight = flightDetails(registration, passportOffice, givenName,surName,dob, emailId, loginId,password);
if(flight==true)
ref="passport verification successful";
else
ref="passport verification unsuccessful";
return ref ;
}

public static boolean flightDetails(String registration, String passportOffice, String givenName,String surName, String dob, String emailId, String loginId, String password)
{
	boolean flight = false;
boolean isregistration = false;
boolean ispassportOffice= false;
boolean isgivenName = false;
boolean issurName = false;
boolean isdob = false;
boolean isEmailId = false;
boolean isloginId = false;
boolean ispassword = false;
if(registration!= null && registration=="PO")
{
isregistration = true;
}
else
	{
System.out.println("invalid registration");
}
if(passportOffice!=null && passportOffice=="kempegowda")
{
ispassportOffice = true;  
}
else
{
System.out.println("invalid office");
}
if(givenName!= null && givenName.length()>0 && givenName.length()<7)
{
isgivenName = true;
}
else
{
System.out.println("Invalid Name");
}
if(surName!=null && surName.length()>0 && surName.length()<=5)
{
issurName = true;
}
else
{
System.out.println("invalid name");
}
if(dob!=null)
{
isdob = true;
}
else
{
System.out.println("dob is invalid");
}
if(emailId!=null)
{
isEmailId = true;
}
else
{
System.out.println("Invalid mailId");
}
if(loginId!=null)
{
isloginId = true;
}
else
{
System.out.println("Invalid loginId");
}
if(password!=null)
{
ispassword = true;
}
else
{
System.out.println("Invalid password");
}
if(isregistration==true && ispassportOffice==true && isgivenName==true && issurName==true && isdob==true && isEmailId==true && isloginId==true && ispassword==true)
{
	flight=true;
}
return flight ;

}
}