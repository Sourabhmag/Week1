package finalFunctional;
import java.util.*;
public class Fun16_windChill 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of temperature in F (Enter value less than 50)");
		double t = sc.nextDouble();
		if(t>50)
		{
			System.out.println("Enter less than 50");
			return;
		}
		System.out.println("Enter value of wind speed in miles per hour (Enter value between 3 and 120)");
		double v = sc.nextDouble();
		if(v<3 || v>120)
		{
			System.out.println("Enter value between 3 and 120");
			return;
		}
		double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		System.out.println("Wind Speed = "+w);
	}
}
