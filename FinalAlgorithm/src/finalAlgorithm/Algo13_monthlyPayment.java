package finalAlgorithm;
import java.util.*;
public class Algo13_monthlyPayment 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of years");
		double Y = sc.nextDouble();
		System.out.println("Enter Loan amount");
		double P=sc.nextDouble();
		System.out.println("Enter monthly interest rate");
		double R = sc.nextDouble();
		double r = R/(12*100);
		double n = 12*Y;
		double a = Math.pow((1+r),(-n));
		double payment  = (P*r)/(1-a);
		System.out.println("Payment = "+payment);
	}
}
