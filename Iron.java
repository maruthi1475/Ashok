class Iron 
{
	static boolean connected = false;
	static int currentHeat ;
	static int minimumHeat ;
	static int maximumHeat = 5;
	
	public static void onOrOff(){
	if(connected == false){
	connected = true;
	System.out.println("iron is On");
	}
	else{
	connected = false ;
	System.out.println("iron is Off");
	}
	}
	
	public static void incHeat(){
	if(connected == true){
	if(currentHeat < maximumHeat){
	currentHeat = currentHeat+1;
	System.out.println("the heat of the iron is " +currentHeat);
	}else
	
	System.out.println("the maximum Heat reached");
	}else
	
	System.out.println("turn on the iron");
	
	}
	
	
	
	public static void decHeat(){
	if(connected == true){
	if(currentHeat > minimumHeat){
	currentHeat = currentHeat-1;
	System.out.println("the Heat of the iron is " +currentHeat);
	}else
	
	System.out.println("the minimum Heat reached");
	}else
	
	System.out.println("turn on the iron");
	
	}
	
	
}

	