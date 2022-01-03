package service;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service sv = new Service();
		
		System.out.println("Enter the number of companies");
		int numberOfCompany = sc.nextInt();
		double arr[] = new double[numberOfCompany];
		boolean[] stockState = new boolean[numberOfCompany];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the current stocks of Company " + (i + 1));
			arr[i] = sc.nextDouble();
			System.out.println("Whether the Company's stock price rose today compared to yesterday?");
			stockState[i] = sc.nextBoolean();
		}
		
		//  System.out.println(Arrays.toString(stockState));
		// Incomplete Code
		double key=0;
		int choice;
		do{
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1 - Display the company stock prices in ascending order");
			System.out.println("2 - Display the company stock prices in descending order");
			System.out.println("3- Display the total number of companies whose stock price rose today");
			System.out.println("4- Display the total number of companies whose stock price declined today");
			System.out.println("5- Search a specific stock price");
			System.out.println("6- Press 0  to exit...");
			System.out.println("---------------------------------");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : sv.sortArrAscending(arr); break;
			case 2 : sv.sortArrDescending(arr); break;
			case 3 : sv.stocksRisen(stockState); break;
			case 4 : sv.stocksDeclined(stockState); break;
			case 5 : sv.findStockPrize(arr, key); break;
			case 6 : System.out.println("Thank You"); System.exit(0);
			default : System.out.println("Please enter a valid option"); break;
			}
		
		}while(choice > 0 && choice < 6);
	}
}
