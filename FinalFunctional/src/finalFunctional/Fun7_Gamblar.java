package finalFunctional;
import java.util.*;
public class Fun7_Gamblar 
{
	// TODO Auto-generated method stub
	public static void main(String []args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Stack,Goal and Number");
				int stack = sc.nextInt();
				int goal = sc.nextInt();
				int num = sc.nextInt();
				int gamb=0,win=0,loss=0;
						while(stack!=0 && stack != goal && num!=0)
						{
							num--;
							gamb++;
							double x = Math.random();
							if(x>=0.5)
								{
									win++;
									++x;
								}
							else 
								{
									loss++;
									--x;
								}
						}
					System.out.println("Win = "+win);
					System.out.println("loss = "+loss);
					System.out.println("Percentage Win = "+(100*win/gamb));
					System.out.println("Percentage Loss = "+(100*loss/gamb));
	}
}
