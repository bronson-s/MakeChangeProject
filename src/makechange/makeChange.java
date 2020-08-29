package makechange;

import java.util.Scanner;

public class makeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("please enter item price: ");
		double price = kb.nextDouble();

		System.out.println("please enter amount tendered: ");
		double amount = kb.nextDouble();

		if (amount == price) {
			System.out.println("Thank you for exact amount! ");
		}

		else if (amount < price) {
			System.out.println("Can not complete sale.");

		}

		else {
			makeChange(amount, price);

		}

	}

	public static void makeChange(double n, double x) {
		int tenDB = 0;
		int fiveDB = 0;
		int oneDB = 0;
		int qaurter = 0;
		int dime = 0;
		int nick = 0;
		int penn = 0;

		double change = n - x;
		System.out.println();
		System.out.println("Change = " + change);
		System.out.println();
		System.out.println("Your change is: ");
		System.out.println();

		while (change >= 10) {
			tenDB++;
			change -= 10;
		}
		while (change >= 5) {
			fiveDB++;
			change -= 5;
		}
		while (change >= 1) {
			oneDB++;
			change -= 1;
		}
		while (change >= .25) {
			qaurter++;
			change -= .25;
		}
		while (change >= .1) {
			dime++;
			change -= .1;
		}
		while (change >= .05) {
			nick++;
			change -= .05;
		}
		while (change >= .01) {
			penn++;
			change -= .01;
		}
		System.out.print(tenDB + " Tens");
		System.out.print(" " + fiveDB + " Fives");
		System.out.println(" " + oneDB + " Ones");
		System.out.println();
		System.out.println("AND ");
		System.out.println();
		System.out.print(qaurter + " qaurters");
		System.out.print(" " + dime + " dimes");
		System.out.print(" " + nick + " nickles");
		System.out.print(" and " + penn + " pennies");

	}
}
