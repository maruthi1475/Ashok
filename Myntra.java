class Myntra{
public static String checkIn(String fullName, String address, String size){
String ref = null;
boolean info = verifyinInfo(fullName,address,size);
if(info==false)
ref="user checkIn Successfull";
else
ref="user checkIn Unsuccessfull";
return ref;
}
public static boolean verifyinInfo(String fullName, String address, String size)
{
boolean info = true;
boolean isfullName = true;
boolean isAddress = true;
boolean isSize = true;
if(fullName!= null && fullName.length()<=15)
{
isfullName = false;
}
else
	{
System.out.println("fullName is valid");
}
if(address!=null)
{
isAddress = false;
}
else
{
System.out.println("Address is invalid");
}
if(size!=null)
{
isSize = false;
}
else
{
System.out.println("User size is too short");
}
if(isfullName==false && isAddress==false && isSize==false)
{
	info=false;
}
return info ;

}
}