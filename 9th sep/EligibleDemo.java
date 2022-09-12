/*
@class name: Eliible Demo
@author: sayantan naskar
@date: 9th sep 2022
*/
//declaring class 

class EligibleDemo
{
public static void main(String [] args)
{
float totalmarks=Float.parseFloat(args[0]);
float pcmmarks=Float.parseFloat(args[1]);
if(totalmarks>60)
{
	if((totalmarks>=80)|| (pcmmarks>=85))
	{
		System.out.println("you are eligible to admition in B-Tech");
	}

else
{
		System.out.println("you are eligible to admition. except B-Tech");
}
}
else
{
	System.out.println("you are not eligible");
	
}
}	
	
	
	
}