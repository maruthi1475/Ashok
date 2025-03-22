class Fan 
{
	static boolean connected = false;
	static int currentSpeed ;
	static int minimumSpeed ;
	static int maximumSpeed = 5;
	
	public static void onOrOff(){
	if(connected == false){
	connected = true;
	System.out.println("fan is On");
	}
	else{
	connected = false ;
	System.out.println("fan is Off");
	}
	}
	
	public static void incSpeed(){
	if(connected == true){
	if(currentSpeed < maximumSpeed){
	currentSpeed = currentSpeed+1;
	System.out.println("the Speed of the fan is " +currentSpeed);
	}else
	
	System.out.println("the maximum Speed reached");
	}else
	
	System.out.println("turn on the fan");
	
	}
	
	public static void decSpeed(){
	if(connected == true){
	if(currentSpeed > minimumSpeed){
	currentSpeed = currentSpeed-1;
	System.out.println("the Speed of the fan is " +currentSpeed);
	}else
	
	System.out.println("the minimum Speed reached");
	}else
	
	System.out.println("turn on the fan");
	
	}
	
	
}

	