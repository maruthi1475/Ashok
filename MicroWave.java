class MicroWave 
{
	static boolean connected = false;
	static int currentTemp ;
	static int minimumTemp ;
	static int maximumTemp = 10;
	
	public static void onOrOff(){
	if(connected == false){
	connected = true;
	System.out.println("microwave is On");
	}
	else{
	connected = false ;
	System.out.println("microwave is Off");
	}
	}
	
	public static void incTemp(){
	if(connected == true){
	if(currentTemp < maximumTemp){
	currentTemp = currentTemp+1;
	System.out.println("the temperature is " +currentTemp);
	}else
	
	System.out.println("the maximum temperature reached");
	}else
	
	System.out.println("turn on the microwave");
	
	}
	
	public static void decTemp(){
	if(connected == true){
	if(currentTemp > minimumTemp){
	currentTemp = currentTemp-1;
	System.out.println("the temperature is " +currentTemp);
	}else
	
	System.out.println("the minimum temperature reached");
	}else
	
	System.out.println("turn on the microwave");
	
	}
	
	
}

	