package com.BridgeLabz.BasicCorePrograms;
import java.util.*;
public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of times you want to flip coin");
		int count = sc.nextInt();
		int H = 0, T = 0;
		double[] arr = new double[count];
		for (int i = 0; i < count; i++) {
			arr[i] = (Math.random()) * 2;
		}
		for (int i = 0; i < count; i++) {
			if (arr[i] <= 0.5)
				H++;
			else
				T++;
		}
		System.out.println("Head Percentage = " + (H * 100 / count));
		System.out.println("Tail Percentage = " + (T * 100 / count));
		System.out.print("Head Percentage = " + (H * 100 / T));
	}

}
