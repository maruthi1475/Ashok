class Projector 
{
	static boolean connected = false;
	static int currentVol ;
	static int minimumVol ;
	static int maximumVol = 20;
	
	public static void onOrOff(){
	if(connected == false){
	connected = true;
	System.out.println("projector is On");
	}
	else{
	connected = false ;
	System.out.println("projector is Off");
	}
	}
	
	public static void incVol(){
	if(connected == true){
	if(currentVol < maximumVol){
	currentVol = currentVol+1;
	System.out.println("the Volume is " +currentVol);
	}else
	
	System.out.println("the maximum volume reached");
	}else
	
	System.out.println("turn on the projector");
	
	}
	
	public static void decVol(){
	if(connected == true){
	if(currentVol > minimumVol){
	currentVol = currentVol-1;
	System.out.println("the Volume is " +currentVol);
	}else
	
	System.out.println("the minimum Volume reached");
	}else
	
	System.out.println("turn on the projector");
	
	}
	
	
}

	