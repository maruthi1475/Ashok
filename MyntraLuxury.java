class MyntraLuxury{
public static String checkIn(String fullName, String colour, String size){
String ref = null;
boolean info = verifyingInfo(fullName,colour,size);
if(info==false)
ref="user checkIn Successfull";
else
ref="user checkIn Unsuccessfull";
return ref;
}
public static boolean verifyingInfo(String fullName, String colour, String size)
{
boolean info = true;
boolean isfullName = true;
boolean iscolour = true;
boolean isSize = true;
if(fullName!= null && fullName.length()<=15)
{
isfullName = false;
}
else
	{
System.out.println("fullName is valid");
}
if(colour!=null && colour=="navy blue")
{
iscolour = false;
}
else
{
System.out.println("colour is invalid");
}
if(size!=null)
{
isSize = false;
}
else
{
System.out.println("User size is too short");
}
if(isfullName==false && iscolour==false && isSize==false)
{
	info=false;
}
return info ;

}
}