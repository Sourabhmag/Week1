package finalFunctional;

import java.util.Arrays;
import java.util.Scanner;

public class Fun8_coupon 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Coupons");
		int coupons = sc.nextInt();
		int duplicates=0;
		double []arr = new double[coupons];
		int ary[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Math.random()*1000;
		}
		Arrays.sort(arr);
		for(int j = 1;j<arr.length;j++)
		{
			if(arr[j-1]==arr[j])
			{
				duplicates++;
				ary[j]=j;
			}
			ary[j]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Coupon no "+(i+1)+" = "+arr[i]);
		}
		System.out.println("Duplicates found = "+duplicates);
	}
}
