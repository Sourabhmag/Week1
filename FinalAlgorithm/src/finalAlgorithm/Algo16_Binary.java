package finalAlgorithm;

import java.util.Scanner;

public class Algo16_Binary 
{
	public int[] convertTobinary(int num)
	{
		int i=0,temp=0;
		int []temparr = new int[8];
		while(num!=1)
		{
			temparr[i]=num%2;
			i++;
			num/=2;
		}
		temparr[i]=num;
		int arr[]=new int[8];
		for(int k = 7;k>=0;k--)
		{
			arr[temp]=temparr[k];
			temp++;
		}
		return arr;
	}
	public int nibble(Algo16_Binary bin)
	{
		System.out.println("Enter number for nibble");
		Scanner sc = new Scanner(System.in);
		int nibble = sc.nextInt();
		int arr[]= bin.convertTobinary(nibble);
		int sum=0;
		for(int i = 0;i<8;i++)
		{
			sum=(int)(sum+arr[i]*Math.pow(2.0,i));
		}
		System.out.println(sum);
		return sum;
	}
	public void power(int val)
	{
		boolean flag=false;
		for(int i = 0;i<8;i++)
		{
			if(val==Math.pow(2.0,i))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("resultant number is the number is a power of 2");
		}
		else
		{
			System.out.println("resultant number is the number is not a power of 2");
		}
	}
	public static void main(String[] args) 
	{
		Algo16_Binary bin = new Algo16_Binary();
		int val;
		val= bin.nibble(bin);
		bin.power(val);
	}
}
