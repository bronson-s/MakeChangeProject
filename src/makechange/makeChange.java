package makechange;

import java.util.Scanner;

public class makeChange {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
			 int tenDB=  0;
		 int fiveDB= 0;
		 int oneDB= 0; 
		 double qaurter= 0;
		 double dime= 0;
		 double nick= 0;
		 double penn= 0;
	
		
	
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
		 System.out.println(change);

		 while(change >= 10) {
			 tenDB++;
			 change -= 10;
			 
		 }
		 
		 System.out.println(tenDB + "ten dollar bills");
	 }

	
}
}
