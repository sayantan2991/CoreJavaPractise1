/*
Program: Phone charging demo
Author Sayantan Naskar
@ Date 13th sep 2022
*/

class PhoneCharge
{
static void startCharging(int batteryLife)
{
	if(betteryLife<=100)
	{
		System.out.println("----charging-----"+batteryLife);
		batteryLife+=15;
		if(batteryLife>=100)
			break;
		
	}
	if(batteryLife>=100)
	{
		System.out,println("-----fully charged-----")
	}
}
public static void main(String...args)
{
int battery= Integer.parseInt(args[0]);
sartCharging(battery);
	
}
}


