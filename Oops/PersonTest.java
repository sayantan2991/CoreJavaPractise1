/*
Progaram : Static variable VS Instance variable
@author: Sayantan Naskar
@Date
*/

class PersonTest
{
   
   public static void main(String ...args)
   {
	   Person p1= new Person("Sweety",20,"Female");
	    System.out.println("Person count :"+p1.counter);
	   Person p2= new Person("Chaitali",19,"Female");
	    System.out.println("Person count :"+p2.counter);
	   Person p3= new Person("Royston",22,"Male");
	  System.out.println("Person count :"+p3.counter);
	   // Person.colonyChange("Mathura");
	   
	   System.out.println("--------------------------------------------------------");
	   
	   p1.display();
	   
	   System.out.println("--------------------------------------------------------");
	  
	   p2.display();
	   System.out.println("--------------------------------------------------------");
	   
	   p3.display();
	   
	   
	   
   }
	
	
	
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
P