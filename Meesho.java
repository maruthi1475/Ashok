class Meesho{
public static String meeshoLogin(String fullName, String phoneNumber, String size){
String ref = null;
boolean personalDetails = verifyingpersonalDetails(fullName,phoneNumber,size);
if(personalDetails==false)
ref="user meeshoLogin Successfull";
else
ref="user meeshoLogin Unsuccessfull";
return ref;
}
public static boolean verifyingpersonalDetails(String fullName, String phoneNumber, String size)
{
boolean personalDetails = true;
boolean isfullName = true;
boolean isphoneNumber = true;
boolean isSize = true;
if(fullName!= null && fullName.length()<=15)
{
isfullName = false;
}
else
	{
System.out.println("fullName is valid");
}
if(phoneNumber!=null)
{
isphoneNumber = false;
}
else
{
System.out.println("phoneNumber is invalid");
}
if(size!=null)
{
isSize = false;
}
else
{
System.out.println("this size is out of stock");
}
if(isfullName==false && isphoneNumber==false && isSize==false)
{
	personalDetails=false;
}
return personalDetails ;

}
}