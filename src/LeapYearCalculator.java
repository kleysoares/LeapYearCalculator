import java.util.Scanner;

public class LeapYearCalculator {
	private static String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	/**
	 * Check if the year is whether a leap year or not.
	 * 
	 * @param int year
	 * @return a boolean
	 */
	private static boolean isLeapYear(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}
	
	/**
	 * Print 28 days for February of a not leap year.
	 */
	private static void print28Days() {
		for(int i = 1; i <= 28; ++i) {
			if(i < 10)
				System.out.print("    " + i);
			else
				System.out.print("   " + i);
			if((i % 7 == 0))
				System.out.println();
		}
	}
	
	/**
	 * Print 29 days for February of a leap year.
	 */
	private static void print29Days() {
		for(int i = 1; i <= 29; ++i) {
			if(i < 10)
				System.out.print("    " + i);
			else
				System.out.print("   " + i);
			if((i % 7 == 0))
				System.out.println();
		}
	}
	
	/**
	 * Print 30 days for certain months of the year.
	 */
	private static void print30Days() {
		for(int i = 1; i <= 30; ++i) {
			if(i < 10)
				System.out.print("    " + i);
			else
				System.out.print("   " + i);
			if((i % 7 == 0))
				System.out.println();
		}
	}
	
	/**
	 * Print 31 days for certain months of the year.
	 */
	private static void print31Days() {
		for(int i = 1; i <= 31; ++i) {
			if(i < 10)
				System.out.print("    " + i);
			else
				System.out.print("   " + i);
			if((i % 7 == 0))
				System.out.println();
		}
	}
	
	/**
	 * This method puts all the methods above together. It prints the number of days depending on which month of the year is. It also prints 29 days for February of a leap year.
	 * 
	 * @param year
	 */
	public static void printMonth(int year) {
		for(int i = 0; i < month.length; ++i) {
			System.out.println("\n");
			System.out.println("          " + month[i] + "   -    " + year);
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			if(i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
				print31Days();
			else
				if(i == 3 || i == 5 || i == 8 || i == 10)
					print30Days();
				else {
					if(!isLeapYear(year)) {
						print28Days();
					} else
						print29Days();
				}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year >>>> ");
		int year = input.nextInt();
		
		if(isLeapYear(year))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		
		printMonth(year);
		
	}
}
