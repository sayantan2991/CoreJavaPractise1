/*
Program: Pattern Demo
*
*
*
*
*
Second pattern
*  i=1
**    2
***    3
****    4
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class PatternDemo
{

static void firstPattern(int num)
{

for(int i=1; i<=num; i++)
{
System.out.println("*");

}	
}

static void numberPattern(int numOfRows)
// printing numbers
{
	for(int i=1; i<=numOfRows; i++)
	{
		System.out.println();
for(int j=1; j<=i; j++)
{
	System.out.print(j +" ");
}	
	}
			
}

static void secondPattern(int numOfRows)
{
	for(int i=1; i<=numOfRows; i++)
	{
		System.out.println();
			for(int j=1; j<=i; j++)
			{
			System.out.print(" * ");
			}	
	}
}


static void thirdPattern(int numOfRows)

{
	for(int i=1; i<=numOfRows; i--)
	{
		System.out.println();
		for(int j=1; j<=i; j--)
		{
		System.out.print("* ");
		}	
	}
			
}

	public static void main(String...args)
	{
		int number= Integer.parseInt(args[0]);
	thirdPatternPattern(number);
	}
	
	
	
	
}



