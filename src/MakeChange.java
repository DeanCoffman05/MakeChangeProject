import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
// The user is prompted asking for the price of an item 
		System.out.println("Please provide the price of your item: ");
		double itemPrice = sc.nextDouble();

// The user is then prompted asking how much money was tendered by the customer. 

		System.out.println("How much money is being tendered?: ");
		double tendered = sc.nextDouble();

// Check if the amount tendered is enough to cover the cost of the item. 
// Determine the difference tendered to price for change. 
		if (tendered < itemPrice) {
			System.out.println("I'm sorry, that's not enough money for your item.");
			System.exit(0);
		} else if (tendered == itemPrice) {
			System.out.println("Thank you for providing the exact change. Have a great day!");
		} else {
		}

// Find the change by subtracting itemPrice from tendered. 
//Breakdown the bills from change. 

		double change = tendered - itemPrice;

		int bills = (int) change;
		System.out.println("Your change is:  " + (float) change);
		
		// Math check DO NOT DELETE System.out.println("Bills " + bills); 
		System.out.println(" ");// space between
		
		int cents = (int) ((change - bills) * 100 + 0.0005); //Issue with cents returning one lower than supposed to. Might be ceiling/ floor?
		// Math check DO NOT DELETE  System.out.println("Cents " + cents);

// This is the logic that determines the paper money change from the difference of the tendered and the item price.
		int count = bills;

		if (bills > 0) {
			 int twenty = bills / 20;
				if (twenty > 0) {
				System.out.println(twenty + " Twenties");
				count = bills - (twenty * 20);
			}
		}   if (bills > 0) {
				int ten = count / 10;

				if (ten > 0) {
				System.out.println(ten + " Tens");
				count = count - (ten * 10);
			}
		}   if (count > 0) {
				int five = count / 5;
				
				if (five > 0) {
				System.out.println(five + " Fives");
				count = count - (five * 5);
			}
		} if (count > 0) {
				int one = count / 1;
				
				if (one > 0) {
				System.out.println(one + " Ones");
				count = count - (one * 1);
			}
		} else {	
		
		}
		
// This is the logic that determines the breakdown of change from the difference of tendered and purchase price. 		
		int countCents = cents;
		
		if (cents > 0) {
			int quarter = cents / 25;
				
				if (quarter > 0) {
				System.out.println(quarter + " Quarters");
				countCents = cents - (quarter * 25);
			}
		}   if (cents > 0) {
				int dime = countCents / 10;

				if (dime > 0) {
				System.out.println(dime + " Dimes");
				countCents = countCents - (dime * 10);
			}
		}   if (cents > 0) {
				int nickel = countCents / 5;
				
				if (nickel > 0) {
				System.out.println(nickel + " Nickels");
				countCents = countCents - (nickel * 5);
			}
		}   if (countCents > 0) {
				int penny = countCents;
				
				if (penny > 0) {
				System.out.println(penny + " Pennys");
				//countCents = countCents - (penny * 1);
			}
		} else {	
		
		}
sc.close();
	}
	
}


// Display an appropriate message if the customer provided too little money or the exact amount. 


