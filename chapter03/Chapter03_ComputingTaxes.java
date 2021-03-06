package chapter03;

import java.util.Scanner;

public class Chapter03_ComputingTaxes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(
				"Enter filing status (0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of  household) ");
		int status = input.nextInt();

		System.out.print("Enter income: ");
		double income = input.nextDouble();

		double tax = 0;
		if (status == 0) {
			if (income <= 8350) {
				tax = income * 0.1;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			} else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			} else if (income <= 372950) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.33;
			} else {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			}
		} else if (status == 1) {
			if (income <= 16700) {
				tax = income * 0.1;
			} else if (income <= 67900) {
				tax = income * 0.15;
			} else if (income <= 137050) {
				tax = income * 0.25;
			} else if (income <= 208850) {
				tax = income * 0.28;
			} else if (income <= 372950) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else if (status == 2) {
			if (income <= 8350) {
				tax = income * 0.1;
			} else if (income <= 33950) {
				tax = income * 0.15;
			} else if (income <= 68525) {
				tax = income * 0.25;
			} else if (income <= 104425) {
				tax = income * 0.28;
			} else if (income <= 186475) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else if (status == 3) {
			if (income <= 11950) {
				tax = income * 0.1;
			} else if (income <= 45500) {
				tax = income * 0.15;
			} else if (income <= 117450) {
				tax = income * 0.25;
			} else if (income <= 190200) {
				tax = income * 0.28;
			} else if (income <= 372950) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else {
			System.out.println("Invalid status");
			System.exit(1);
		}

		System.out.println("Tax is " + (int) (tax * 100) / 100.0);
	}
}