package finalAlgorithm;
import java.util.*;
public class Algo12_tempConversion 
{
	public static void celtofah()
	{
		 System.out.println("Enter Temperature in Celsius");
		 Scanner sc = new Scanner(System.in);
		 double cel = sc.nextDouble();
		 double f;
		 f=(cel * 9/5) + 32;
		 System.out.println("Temperature in Celsius = "+cel);
		 System.out.println("Temperature in Fahrenheit = "+f);
	}
	public static void fahtocel()
	{
		System.out.println("Enter Temperature in Fahrenheit");
		 Scanner sc = new Scanner(System.in);
		 double f = sc.nextDouble();
		 double cel;
		 cel = (f - 32) * 5/9;
		 System.out.println("Temperature in Fahrenheit = "+f);
		 System.out.println("Temperature in Celsius = "+cel);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :\n 1) Celsius to fahrenheit\n 2) Fahrenheit to Celsius");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: celtofah(); break;
			case 2: fahtocel(); break;
			default : System.out.println("Enter valid choice");
		}
	}

}
