class Puma{
public static String pumaSignin(String fullName, String shoeColour, String size){
String ref = null;
boolean shoeInfo = verifyingshoeInfo(fullName,shoeColour,size);
if(shoeInfo==false)
ref="user pumaSignin Successfull";
else
ref="user pumaSignin Unsuccessfull";
return ref;
}
public static boolean verifyingshoeInfo(String fullName, String shoeColour, String size)
{
boolean shoeInfo = true;
boolean isfullName = true;
boolean isshoeColour = true;
boolean isSize = true;
if(fullName!= null && fullName.length()<=15)
{
isfullName = false;
}
else
	{
System.out.println("fullName is valid");
}
if(shoeColour!=null && shoeColour=="white")
{
isshoeColour = false;
}
else
{
System.out.println("shoeColour is invalid");
}
if(size!=null && size=="8")
{
isSize = false;
}
else
{
System.out.println("this size is out of stock");
}
if(isfullName==false && isshoeColour==false && isSize==false)
{
	shoeInfo=false;
}
return shoeInfo ;

}
}