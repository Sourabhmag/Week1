package finalFunctional;
import java.util.*;
public class Fun5_HarmonicNum 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		double val=1;
		if(n==0)
		{
			System.out.println("Entered number can not be Zero");
			return;
		}
		else
		{
			System.out.println("1"+"\t"+val);
			for(int i=2;i<=n;i++)
			{
				val += (double)1/i; 
				System.out.println(i+"\t"+val);
			}
			
		}

	}

}
