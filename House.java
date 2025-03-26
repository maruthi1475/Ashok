class House{

 String address;
 int numberOfRooms;
 int yearBuilt;
 String totalArea;
 int numberOfFloors;
 boolean isGarbageAvailable;
 
  House(){
   this("123 Maple Street, Los Angeles, CA");
   System.out.println("Constructor without arg is invoked");
  }
  
  House(String address){
   this(9);
   this.address = address;
   System.out.println("Constructor with 1 String is invoked");
  }
  
  House(int numberOfRooms){
  this(1995," 2,500 sq. ft.");
  this.numberOfRooms = numberOfRooms;
  System.out.println("constructor with 1 int is invoked");
  }
  
  House(int yearBuilt , String totalArea){
  this(4 , true );
  this.yearBuilt = yearBuilt;
  this.totalArea = totalArea;
  System.out.println("Constructor with 1 int and 1 String is invoked");
}

  House(int numberOfFloors , boolean isGarbageAvailable){
  this(1995,4);
  this.numberOfFloors = numberOfFloors;
  this.isGarbageAvailable = isGarbageAvailable;
  System.out.println("Constructor with 1 int and 1 boolean is invoked");
}

  House(int yearBuilt ,int numberOfFloors ){
  this("123 Maple Street, Los Angeles, CA"," 2,500 sq. ft.");
  this.yearBuilt = yearBuilt;
  this.numberOfFloors = numberOfFloors;
  System.out.println("Constructor with 2 int is invoked");
  }
  
  House(String address , String totalArea){
  this.address = address;
  this.totalArea = totalArea;
  System.out.println("Constructor with 2 String is invoked");
}
  public void display(){
  System.out.println("the address is "+address);
  System.out.println("the numberOfRooms is "+numberOfRooms);
  System.out.println("the yearBuilt is "+yearBuilt);
  System.out.println("the totalArea is "+totalArea);
  System.out.println("the numberOfFloors is "+numberOfFloors);
  System.out.println("the isGarbageAvailable is "+isGarbageAvailable);
  }
  }