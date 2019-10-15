package finalFunctional;
import java.util.*;
public class Fun4_PowerOf2 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n>30)
		{
			System.out.println("Number should be less than 31");
			return;
		}
		for(int i=0;i<=n;i++)
		{
			System.out.println(i+"\t"+Math.pow(2, i));
		}

	}

}
