package cashMachine;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price, tendered, difference;
		String change = "";

		System.out.print("Please enter the price of the item: ");
		price = keyboard.nextDouble();
		System.out.print("\nPlease enter the amount of money tendered: ");
		tendered = keyboard.nextDouble();
		difference = tendered - price;

		if (price == tendered) {
			System.out.println("You've given exact change! Thanks for that. Now get out!");
		} else if (price > tendered) {
			System.out.println("That's not enough money at all! Now get out!");
		}

		else {
			while (difference > 0) {

				if ((difference / 20) >= 1) {
					double num20 = difference / 20;
					difference %= 20;
					if ((int)num20 == 1) {
						System.out.print((int)num20 + " twenty, ");
					}
					else {
					System.out.print((int)num20 + " twenties, ");
					}
				} 
				else if ((difference / 10) >= 1) {
					double num10 = difference / 10;
					difference %= 10;
					if ((int)num10 == 1) {
						System.out.print((int)num10 + " ten, ");
					}
					else {
					System.out.print((int)num10 + " tens, ");
					}
				} else if ((difference / 5) >= 1) {
					double num5 = difference / 5;
					difference %= 5;
					if ((int)num5 == 1) {
						System.out.print((int)num5 + " five, ");
					}
					else {
					System.out.print((int)num5 + " fives, ");
					}
				} else if ((difference / 1) >= 1) {
					double num1 = difference / 1;
					difference %= 1;
					if ((int)num1 == 1) {
						System.out.print((int)num1 + " one, ");
					}
					else {
						System.out.print((int)num1 + " ones, ");
					}
				} else if ((difference / 0.25) >= 1){
					double numQ = difference / 0.25;
					difference %= 0.25;
					if ((int)numQ == 1) {
						System.out.print((int)numQ + " quarter, ");
					}
					else {
						System.out.print((int)numQ + " quarters, ");
					}
				} else if ((difference / 0.10) >= 1){
					double numD = difference / 0.10;
					difference %= 0.10;
					if ((int)numD == 1) {
						System.out.print((int)numD + " dime, ");
					}
					else {
						System.out.print((int)numD + " dimes, ");
					}
				} else if ((difference / 0.05) >= 1) {
					double numN = difference / 0.05;
					difference %= 0.05;
					if ((int)numN == 1) {
						System.out.print((int)numN + " nickel, ");
					}
					else {
						System.out.print((int)numN + " nickels, ");
					}
				} else if ((difference / 0.01) >= 1) {
					double numP = difference / 0.01;
					difference %= 0.01;
					if ((int)numP == 1 ) {
						System.out.print((int)numP + " penny.");
					}
					else {
						System.out.print((int)numP + "pennies.");
					}
					
				}
				
			}
		}
	}
}
