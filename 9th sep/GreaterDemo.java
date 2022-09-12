/*
@class name: Greater of 3  number
@author: sayantan naskar
@date: 9th sep 2022
*/
//declaring class 
class GreaterDemo
{
	// calling main method  
	public static void main(String[] args)
	{
	int number1= Integer.parseInt(args[0]); //taking input from user
	int number2= Integer.parseInt(args[1]);
	int number3= Integer.parseInt(args[2]);	
	//chaking the age

		if ((number1==number2) && (number1==number3))
		{
			System.out.println("all number are equal");
			}
			else if ((number1>number2) && (number1>number3))
			{
			System.out.println("number1:" + number1 + "is greastest");
				}
			// End of If srtatement
				else if(number2>number3)
				{
				System.out.println("number2:"+number2+"is greater");
					}
					else
					{
					System.out.println("number3:"+number3+"is greater");	
						}
					// End Of else Statement


		
}
//end of main 
}
//end of class