/*
Program: Treanary Operator
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class TrenaryDemo
{

	static void trenaryEvenOdd(int num)
	{
		String result=(num%2==0)? "Even number":"Odd number";
		System.out.println(result);
		
	}


public static void main(String...args)
{

int number= Integer.parseInt(args[0]);
//ifElseOdd(number);
trenaryEvenOdd(number);

}





}