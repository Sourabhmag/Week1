package finalFunctional;
import java.util.*;
public class Fun9_2D 
{
	public static void addint(int row,int column)
	{
		Scanner sc = new Scanner(System.in);
		int [][]arr = new int[row][column];
		System.out.println("Enter INTEGER elements one by one");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void adddouble(int row,int column)
	{
		Scanner sc = new Scanner(System.in);
		double [][]arr = new double[row][column];
		System.out.println("Enter DOUBLE elements one by one");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextDouble();
			}
		}
	}
	public static void addbool(int row,int column)
	{
		Scanner sc = new Scanner(System.in);
		boolean [][]arr = new boolean[row][column];
		System.out.println("Enter BOOLEAN elements one by one");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextBoolean();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Enter Integers\n2.Enter Double\n3.Enter boolean");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of columns");
		int column=sc.nextInt();
		
		switch(choice)
		{
			case 1 : addint(row,column); break;
			case 2 : adddouble(row,column); break;
			case 3 : addbool(row,column); break;
			default : System.out.println("Enter valid choic");
		}
	}

}
