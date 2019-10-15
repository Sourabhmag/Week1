package com.BridgeLabz.BasicCorePrograms;
import java.util.*;
public class DisplayUsername {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username");
		String username = sc.nextLine();
		int len = username.length();
		if (len < 3) {
			System.out.print("Username length shuld be more then 3");
		} else {
			System.out.print("Hello " + username);
		}
	}
}
