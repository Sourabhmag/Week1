package com.BridgeLabz.LogicalPrograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("To start Calculating time press 1");
		int start = sc.nextInt();
		long start_time = 0;
		long end_time = 0;
		long cal_time ;
		if(start == 1 )
		{
			start_time = System.currentTimeMillis();
		}
		System.out.println("To end press 0");
		int end = sc.nextInt();
		if(end == 0 )
		{
			end_time = System.currentTimeMillis();
		}
		cal_time = (end_time - start_time)/1000;
		System.out.println(cal_time+" sec");
		sc.close();
	}
}
