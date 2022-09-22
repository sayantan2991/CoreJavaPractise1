/*
@class name: Printing number of days according to month	name 
@author: sayantan naskar
@date: 12th sep 2022
*/
//declaring class 

class SwitchMonthAdvDemo
{
public static void main(String [] args)
{

	String monthName= args[0].toLowerCase(); //take input from user
	
	switch(monthName)
	{
		case "january": 
		case "march": 
		case "may":
		case "july":
		case "august":
		case "octabar":
		case "december": System.out.println("Number of days are: 31");
		break;
		case "february": System.out.println("Number of days are: 28");
		break;
		case "april":
		case "june":
		case "september":
		case "november": System.out.println("Number of days are: 30");
	}
	//end of switch

	
}
//end of main 
}	
	//end of class 
	