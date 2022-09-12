/*
Program: print a argument Add 2 number
@author: sayantan naskar
@date: 6th sep2022
*/

//declaring a class
class AddDemo
{
	//caling main
	public static void main(String[] args)
	{
		int x,y,z;
		x=50;
		y=55;
		z=x+y;
		System.out.println("the sum of x+y=" + z);
		int a, b, c;
	a= Integer.parseInt(args[0]);
	b= Integer.parseInt(args[1]);
	c= a+b;
	System.out.println("the sum of a+b=" + c);
	}
	//end main
}
// end class
