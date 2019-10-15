package com.BridgeLabz.BasicCorePrograms;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit year");
		int year = sc.nextInt();
		int test = year;
		int n = 0;
		while (test != 0) {
			test /= 10;
			++n;
		}
		if (n != 4) {
			System.out.println("Year should be 4 digit");
			return;
		} else {
			if (year % 4 == 0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not a Leap year");
			}
		}
	}
}
