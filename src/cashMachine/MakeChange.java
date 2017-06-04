package cashMachine;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price, tendered, difference;

		System.out.print("Please enter the price of the item: ");
		price = keyboard.nextDouble();
		System.out.print("\nPlease enter the amount of money tendered: ");
		tendered = keyboard.nextDouble();
		difference = tendered - price;
		difference = Math.round(difference * 100.0) / 100.0;
		System.out.println("Your change: " + difference);

		if (price == tendered) {
			System.out.println("You've given exact change! Thanks for that. Now get out!");
		} else if (price > tendered) {
			System.out.println("That's not enough money at all! Now get out!");
		}

		else {
			while (difference > 0.0) {
				
				difference = makeChange(difference, 100.0, "one hundred");
				difference = makeChange(difference, 50.0, "fifty");
				difference = makeChange(difference, 20.0, "twenty");
				difference = makeChange(difference, 10.0, "ten");
				difference = makeChange(difference, 5.0, "five");
				difference = makeChange(difference, 1.0, "one");
				difference = makeChange(difference, 0.25, "quarter");
				difference = makeChange(difference, 0.10, "dime");
				difference = makeChange(difference, 0.05, "nickel");
				if ((difference / .01) >= 1) {
					double num = difference / .01;
					difference -= num * .01;
					if (difference < .009) {
						difference = Math.floor(difference * 100.0) / 100.0;
					}
					else {
						difference = Math.round(difference * 100.0) / 100.0;
					}
					if ((int)num == 1 ) {
						System.out.println((int)num + " penny");
					}
					else {
						System.out.println((int)num + " pennies");
					}
				}
			}
		}
		keyboard.close();
	}

	public static Double makeChange(double difference, double value, String moneyName) {
		if ((difference / value) >= 1) {
			double num = difference / value;
			difference %= value;
			if (difference < .009) {
				difference = Math.floor(difference * 100.0) / 100.0;
			}
			else {
				difference = Math.round(difference * 100.0) / 100.0;
			}
			if ((int)num == 1 ) {
				System.out.println((int)num + " " + moneyName);
			}
			else {
				System.out.println((int)num + " " + moneyName + "s");
			}
		}
		return difference;
	}
}