package service;

import java.util.Scanner;
import java.util.Arrays;

public class Service {

	public static void sortArrAscending(double[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // Important for ascending or descending
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void sortArrDescending(double[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) { // Important for ascending or descending
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void stocksRisen(boolean[] stockState) {
		int trueCount = 0;

		for (int i = 0; i < stockState.length; i++) {
			if (stockState[i] == true) {
				trueCount++;
			}
		}
		System.out.println("Total number of companies whose stocks have risen are :" + trueCount);
	}

	public static void stocksDeclined(boolean[] stockState) {
		int falseCount = 0;
		for (int i = 0; i < stockState.length; i++) {
			if (stockState[i] == false) {
				falseCount++;
			}
		}
		System.out.println("Total number of companies whose stocks have declined are :" + falseCount);
	}

	public static void findStockPrize(double[] arr, double key) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter key value");
		key = scan.nextDouble();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
			}
		}
		if (found) {
			System.out.println("Stock price " + key + " is found");
		} else {
			System.out.println("Stock price " + key + " is not found");
		}
	}

}
