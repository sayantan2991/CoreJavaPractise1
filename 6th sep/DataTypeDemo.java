/*
Program: Understanding data types in java
@author: Sayantan Naskar
@date 6th sep 2022
*/

//decalraing a class
class DataTypeDemo
{
	//caling main
	static int number;
public static void main(String[] args)
{
	//primitive data types
	int number=22;
	short value= (short)-32769;// typecasting
	float marks= 67.8f;
	double percentage=90.765;
	char grade= 'A';
	long hugenumber= 8886785746756353L;
	boolean status= true;
	byte b= (byte)128;//typecasting
	
	
	System.out.println("the value of number is=" +number);
	System.out.println("the value of short is=" +value);
	System.out.println("the value of marks is=" + marks);
	System.out.println("the value of percentage is=" + percentage);
	System.out.println("the value of grade is=" + grade);
	System.out.println("the value of hugenumber is=" + hugenumber);
	System.out.println("the value of satus is=" + status);
	System.out.println("the value of b is=" + b);


}
//end of main

}
//end of class DataTypeDemo