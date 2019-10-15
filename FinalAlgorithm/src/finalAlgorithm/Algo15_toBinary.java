package finalAlgorithm;

import java.util.Scanner;

public class Algo15_toBinary 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=0;
		int count=0;
		int []arr= new int [50];
		while(num!=1)
		{
			count++;
			arr[i]=num%2;
			i++;
			num/=2;
			//System.out.println(num);
		}
		arr[i]=num;
		for(int k = count;k>=0;k--)
		{
			System.out.print(arr[k]);
		}
	}
}
