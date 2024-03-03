import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		double grossIncome;
		double taxRate;
		double withholding;
		double netIncome;
		
		// Get income for user
		System.out.println("Enter gross income: ");
		grossIncome = scnr.nextDouble();
		
		// Calculate tax rate
		if (grossIncome < 500.00) {
			taxRate = 0.10;
		}
		else if (grossIncome < 1500.00) {
			taxRate = 0.15;
		}
		else if (grossIncome < 2500.00) {
			taxRate = 0.20;
		}
		else {
			taxRate = .030;
		}
		
		// Calculate withholding
		withholding = grossIncome * taxRate;
		
		// calculate netIncome
		netIncome = grossIncome - withholding;
		
		// Display results
		System.out.printf("Gross income: $%.2f\n", grossIncome);
		System.out.printf("Tax rate: %.2f%%\n", taxRate * 100);
		System.out.printf("Withholding: $%.2f\n", withholding);
		System.out.printf("Net income: $%.2f\n", netIncome);
	}
}
