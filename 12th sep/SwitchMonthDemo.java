/*
@class name: Printing number of days according to month	 
@author: sayantan naskar
@date: 12th sep 2022
*/
//declaring class 

class SwitchMonthDemo
{
public static void main(String [] args)
{

	int monthNumber = Integer.parseInt(args[0]); //take input from user
	
	switch(monthNumber)
	{
		case 1: 
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("Number of days are: 31");
		break;
		case 2: System.out.println("Number of days are: 28");
		break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("Number of days are: 30");
	}
	//end of switch

	
}
//end of main 
}	
	//end of class 
	