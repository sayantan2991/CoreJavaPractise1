/*
Program: Break and continue
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class BreakContinueDemo
{
static void printNumber()
{
for(int i=1; i<=10; i++)
{
	if(i==5)
	{
		break;
	}
	System.out.println(i);
}
}

static void printNumber1()
{
for(int i=1; i<=10; i++)
{
	if(i==5)
	{
		continue;
	}
	System.out.println(i);
}
}

static void printNumber2()
{
	for(int i=1;i<=3;i++)
	{
		System.out.println();
		for(int j=1;j<=3;j++)
		{
			System.out.print(i+""+j+ " ");
		}
	}
	
}

public static void main(String...args)
{
	printNumber2();
	
}
}


