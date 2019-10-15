package com.BridgeLabz.BasicCorePrograms;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double n = sc.nextDouble();
		while (n % 2 == 0) {
			n /= 2;
			System.out.print("2\t");
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + "\t");
				n /= i;
			}
		}
		if (n > 2) {
			System.out.print(n);
		}
	}
}
