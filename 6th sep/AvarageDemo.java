/*
@class name: avarage of 3  number
@author: sayantan naskar
@date: 6th sep 2022
*/
//declaring class 
class AvarageDemo
{
	// calling main method  
	public static void main(String[] args)
	{
	float number1= Float.parseFloat(args[0]);
	float number2= Float.parseFloat(args[1]);
	float number3= Float.parseFloat(args[2]);
	float avaragemark= (number1+number2+number3)/3;
	System.out.println("the avg of 3 num=" + avaragemark);
}
}