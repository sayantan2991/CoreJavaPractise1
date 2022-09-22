class ForLoopDemo
{
static void printNumbers(int t)
{
int i;
for(i=0;i<=t; i++);
{
System.out.println(i);	
}
}
	
	
	
	
	public static void main(String...arga)
	{
		int total= Integer.parseInt(args[0]);
		printNumbers(total);
	}
	
	
	
	
}
