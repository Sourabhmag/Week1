package finalFunctional;

import java.util.Scanner;

public class Fun11_Distance 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X");
		double x = sc.nextDouble();
		System.out.println("Enter value of Y");
		double y = sc.nextDouble();
		System.out.println("Distance = "+Math.sqrt(x*x+y*y));
	}
}
