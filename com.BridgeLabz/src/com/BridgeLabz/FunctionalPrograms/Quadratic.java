package com.BridgeLabz.FunctionalPrograms;
import java.util.*;
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadratic equation is a*x*x + b*x + c = 0");
		System.out.println("Enter value of 'a'");
		int a = sc.nextInt();
		System.out.println("Enter value of 'b'");
		int b = sc.nextInt();
		System.out.println("Enter value of 'c'");
		int c = sc.nextInt();

		double delta = b * b - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("Roots of given Quadratic equation are " + x1 + " and " + x2);
		sc.close();

	}
}
