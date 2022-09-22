/*
@class name: Expression Switch & switch Iinside switch
@author: sayantan naskar
@date: 12th sep 2022
*/
//declaring class 

class SwitchAdvDemo2
{
public static void main(String [] args)
{
	
	//Expresson Level Demo

	String game= args[0].toLowerCase(); //take input from user
	

	
	switch(game)
	{
		case "football": String role= args[1].toLowerCase(); 
		                 System.out.println("I love football");
		
		switch(role)
		{
						  case "keeper": System.out.println("I love goal keeper");
						  break;
						  case "stiker": System.out.println("I love stiker");
                          break;						  
						  default: System.out.println("I love everything"); 
						  
						  
		}
		break;
		case "cricket": System.out.println("I love virat");
		break;
		case "batmintan": System.out.println("I love P.V sindhu");
		break;
		default: System.out.println("I love nothing");
		
		
	}
	//end of switch

	
}
//end of main 
}	
	//end of class 
	