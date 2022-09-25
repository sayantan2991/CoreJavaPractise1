/*
Program: Checking palindrome
3456: not palindromdrome
3443: palindrom
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class Palindrom
{
	static void checkPalindrom(int number)
	{
		int remainder=0;
		int reversedNumber=0; // number used to store reversed number
        int temp= number; //orginal number is stored is temp
			while(number>0)
			{
		remainder = number%10;
		reversedNumber= (reversedNumber*10)+remainder;
		number= number/10;
		
			}
			 
			 if(temp==reversedNumber)
			 {
		 System.out.println("the number is a palindrom");
			 }
			 
			 else
				System.out.println("the number is not a palindrom");
	}
	public static void main(String...args)
	{
		int num1= Integer.parseInt(args[0]);
		checkPalindrom(num1);
	}
	
}
