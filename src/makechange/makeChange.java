package makechange;

import java.util.Scanner;

public class makeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int tenDB = 0;
		int fiveDB = 0;
		int oneDB = 0;
		double qaurter = 0;
		double dime = 0;
		double nick = 0;
		double penn = 0;

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
			double change = amount - price;
			System.out.println("Change = " + change);

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
			System.out.print(tenDB + " ten dollar bills");
			System.out.print(" " + fiveDB + " five dollar bills");
			System.out.println(" " + oneDB +" one dollar bills");
			System.out.println(" and ");
			System.out.print(qaurter + " qaurters");
			System.out.print(dime + " dimes");
			System.out.print(nick +" nickles");
			System.out.print("and " + penn +" pennies");
			
			
			
			

		}

	}
}
