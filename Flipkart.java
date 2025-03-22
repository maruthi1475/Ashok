class Flipkart{
public static String signIn(String firstName, String lastName, String address, String age){
String ref = null;
boolean details = verifyingDetails(firstName,lastName,address,age);
if(details==false)
ref="user signIn Successfully";
else
ref="user signIn Unsuccessfull";
return ref;
}
public static boolean verifyingDetails(String firstName, String lastName, String address, String age)
{
boolean details = true;
boolean isFirstName = true;
boolean isLastName= true;
boolean isAddress = true;
boolean isAge = true;
if(firstName!= null && firstName.length()<=7)
{
isFirstName = false;
}
else
	{
System.out.println("firstName is valid");
}
if(lastName!=null && lastName.length()<=4)
{
isLastName = false;  
}
else
{
System.out.println("lastName is valid");
}
if(address!=null)
{
isAddress = false;
}
else
{
System.out.println("Address is invalid");
}
if(age!=null)
{
isAge = false;
}
else
{
System.out.println("User age is too short");
}
if(isFirstName==false && isLastName==false && isAddress==false && isAge==false)
{
	details=false;
}
return details ;

}
}