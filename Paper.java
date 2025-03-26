class Paper {
    String title;
    String author;
    int pages;
    String publisher;
    int year;
    String subject;
    double price;

   Paper(){
	   this("The Impact of Artificial Intelligence on Modern Healthcare"," Dr. John Smith, Prof. Emily Clark");
	   System.out.println("connstructor without arg is invoked");
   }
   
   Paper(String title,String author){
	   this(100);
	   this.title = title;
	   this.author = author;
	   System.out.println("Constructor with 2 strings is invoked");
   }
   
   Paper(int pages){
	   this(" Published in Nature Biomedical Engineering ",2024);
	   this.pages = pages;
	   System.out.println("Constructor with 1 int is invoked");
   }
   
   Paper(String publisher,int year){
	   this("health care");
	   this.publisher = publisher;
	   this.year = year;
	   System.out.println("Constructor with 1 string n 1 int is invoked");
   }
   
   Paper(String subject){
	   this(1700.89);
	   this.subject = subject;
	   System.out.println("Constructor with 1 String is invoked");
   }
   
   Paper(double price){
	   this(100,2024);
	   this.price = price;
	   System.out.println("Constructor with 1 double is invoked");
   }
   
   Paper(int pages,int year){
	   this.pages = pages;
	   this.year = year;
	   System.out.println("Constructor with 2 int is invoked");
   }
   
   public void display(){
	   System.out.println("the title is "+title);
	    System.out.println("the author is "+author);
		 System.out.println("the pages is "+pages);
		  System.out.println("the publisher is "+publisher);
		   System.out.println("the year is "+year);
		    System.out.println("the subject is "+subject);
			 System.out.println("the price is "+price);
	   
	   
	   
   }
   
}