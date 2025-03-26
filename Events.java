class Events{

 String eventName;
 String eventLocation;
 int noOfWorkers;
 String dateTime;
 String eventType;
 boolean isBelow18IsAllowed;
 int capacity;
 
 Events(){
 this("Tech Expo 2025", "Los Angeles Convention Center, 1201 S Figueroa St, Los Angeles, CA");
 System.out.println("events constructor without agrument is invoked");
 }
 
 Events(String eventName , String eventLocation){
 this(100);
 this.eventName = eventName;
 this.eventLocation = eventLocation;
 System.out.println("Construvtor with 2 String is invoked");
 
 }
 
 Events(int noOfWorkers){
 this(" March 15, 2025, from 10:00 AM to 6:00 PM");
 this.noOfWorkers = noOfWorkers;
 System.out.println("constructor with 1 int is invoked");
 }
 
 Events(String dateTime){
 this("Corporate Conference",500);
 this.dateTime = dateTime;
 System.out.println("constructor with String is invoked");
 }
 
 Events(String eventType, int capacity){
 this(true);
 this.eventType = eventType;
 this.capacity = capacity;
 System.out.println("constructor with String is invoked");
 }
 
 Events(boolean isBelow18IsAllowed){
 this(500,true);
 this.isBelow18IsAllowed = isBelow18IsAllowed;
 System.out.println("constructor with boolean is invoked");
 }
 
 Events(int capacity , boolean isBelow18IsAllowed){
  this.capacity =capacity;
  this.isBelow18IsAllowed = isBelow18IsAllowed;
  System.out.println("constructor with int is invoked");
 }
 
  public void display(){
  System.out.println("the event name is "+eventName);
  System.out.println("the event Location is "+eventLocation);
  System.out.println("the no of Workers is "+noOfWorkers);
  System.out.println("the date Time is "+dateTime);
  System.out.println("the event  Type is "+eventType);
  System.out.println("the  is Below 18 IsAllowed is "+ isBelow18IsAllowed);
  System.out.println("the capacity is "+capacity);
  }



}