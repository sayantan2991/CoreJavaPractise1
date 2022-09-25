/*
Program: For loop demo:While loop
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class WhileDemo
{
static void blubStatus(int status)
{
	while(status>10)
	{
		System.out.println("blub is on" +"----Durability-----" + status);
		status-=5;
	}
	
}

 public static void main(String...args)
{

int durability= Integer.parseInt(args[0]);
blubStatus(durability);

}




}