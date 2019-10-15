package utility;

import java.util.Scanner;

/**  Used To store repeted code 
 * @author user
 *
 */
public class Util {
	Scanner sc = new Scanner(System.in);

	
	/**
	 * Method which merges given arrays of type string
	 * @param left = left side array of type string(first input)
	 * @param right = right side array of type string(second input)
	 * @return
	 */
	public static String[] merging(String[] left, String[] right) {
		// leftpointer = a variable to point array - 'left'
		// rightpointer = a variable to point array - 'right'
		int leftpointer = 0, rightpointer = 0;
		// sorted[] = array to store sorted strings
		String[] sorted = new String[left.length + right.length];
		int mIndex = 0;
		int comp = 0;
		while (leftpointer < left.length || rightpointer < right.length) {
			if (leftpointer == left.length) {
				sorted[mIndex++] = right[rightpointer++];
			} else if (rightpointer == right.length) {
				sorted[mIndex++] = left[leftpointer++];
			} else {
				comp = left[leftpointer].compareTo(right[rightpointer]);
				if (comp > 0) {
					sorted[mIndex++] = right[rightpointer++];
				} else if (comp < 0) {
					sorted[mIndex++] = left[leftpointer++];
				} else {
					sorted[mIndex++] = left[leftpointer++];
				}
			}
		}
		return sorted;
	}

	
	/**  mergeSort = used to sort given strings
	 * @param arr = input array to mergeSort procedure
	 * @return
	 */
	public static String[] mergeSort(String[] arr) {
		String[] sorted = new String[arr.length];
		if (arr.length == 1) {
			sorted = arr;
		} else {
			int mid = arr.length / 2;
			String[] left = new String[mid];
			String[] right = new String[arr.length - mid];
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}
			for (int j = 0; j < arr.length - mid; j++) {
				right[j] = arr[mid + j];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = merging(left, right);
		}
		return sorted;
	}

	
	/** display =  used to display given array of type string
	 * @param arr =  input to display method
	 */
	public static void display(String[] arr) {
		if (arr.length == 0) {
			System.out.println("Given array is empty");
			return;
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

	
	/** swap = used to swap content of given string
	 * @param arr = given string(input to swap method)
	 * @param i = start index of string
	 * @param j = end index of string
	 * @return
	 */
	public static String swap(String arr, int i, int j) {
		char temp;
		char[] charArray = arr.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	
	/**
	 * Recursive method which prints permutation of given string
	 * @param arr = input string given by user
	 * @param first = first index of string 'inputString'
	 * @param last = last index of string 'inputString'
	 */
	public static void PermutationRecursive(String inputString, int first, int last) {
		if (first == last) {
			System.out.println(inputString);
		} else {
			for (int i = first; i <= last; i++) {
				inputString = swap(inputString, first, i);
				PermutationRecursive(inputString, first + 1, last);
				inputString = swap(inputString, first, i);
			}
		}
	}

 
	/**
	 *  dayOfWeek = accept the date and print the day on same date
	 */
	public static void dayOfWeek() {
		Util Util = new Util();
		System.out.println("Enter date");
		int d = Util.sc.nextInt();
		System.out.println("Enter month");
		int m = Util.sc.nextInt();
		System.out.println("Enter year");
		int y = Util.sc.nextInt();

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		switch (d0) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satarday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

	}

	/**
	 *  celtofah = Accepts temperature in celcius and print it in Fahrenheit
	 */
	public static void celtofah() {
		Util Util = new Util();
		System.out.println("Enter Temperature in Celsius");
		double cel = Util.sc.nextDouble();
		double f;
		f = (cel * 9 / 5) + 32;
		System.out.println("Temperature in Celsius = " + cel);
		System.out.println("Temperature in Fahrenheit = " + f);
	}

	/**
	 * fahtocel = Accepts temperature in Fahrenheit and print it in celcius
	 */
	public static void fahtocel() {
		Util Util = new Util();
		System.out.println("Enter Temperature in Fahrenheit");
		double f = Util.sc.nextDouble();
		double cel;
		cel = (f - 32) * 5 / 9;
		System.out.println("Temperature in Fahrenheit = " + f);
		System.out.println("Temperature in Celsius = " + cel);
	}

	/**
	 * temperatureConversion = used to convert temperature
	 */
	public static void temperaturConversion() {
		Util Util = new Util();

		System.out.println("Enter your choice :\n 1) Celsius to fahrenheit\n 2) Fahrenheit to Celsius");
		int choice = Util.sc.nextInt();
		switch (choice) {
		case 1:
			celtofah();
			break;
		case 2:
			fahtocel();
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}

	/**
	 * toBinary = Converts decimal number into binary
	 */
	public static void toBinary() {
		Util Util = new Util();
		System.out.println("Enter the number");
		int num = Util.sc.nextInt();
		int i = 0;
		int count = 0;
		int[] arr = new int[50];
		while (num != 1) {
			count++;
			arr[i] = num % 2;
			i++;
			num /= 2;
			// System.out.println(num);
		}
		arr[i] = num;
		for (int k = count; k >= 0; k--) {
			System.out.print(arr[k]);
		}
	}

	/**
	 * sqrt = It finds square root of given number
	 */
	public static void sqrt() {
		Util Util = new Util();
		System.out.println("enter number");
		double c = Util.sc.nextDouble();
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t) + t) / 2;
		}
		System.out.println(t);
	}

	/**
	 * monthlyPayment = Prints required monthly payment according to loan amount and number of years
	 */
	public static void monthlyPayment() {
		Util Util = new Util();
		System.out.println("Enter Number of years");
		double Y = Util.sc.nextDouble();
		System.out.println("Enter Loan amount");
		double P = Util.sc.nextDouble();
		System.out.println("Enter monthly interest rate");
		double R = Util.sc.nextDouble();
		double r = R / (12 * 100);
		double n = 12 * Y;
		double a = Math.pow((1 + r), (-n));
		double payment = (P * r) / (1 - a);
		System.out.println("Payment = " + payment);
	}

	

}
