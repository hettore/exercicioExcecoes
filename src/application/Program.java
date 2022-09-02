package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.Exception2;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data ");
		System.out.print("Number: ");
		int conta = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String nome = sc.nextLine();
		System.out.print("Inicial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		Account conta1 = new Account(conta, nome, balance, limit);
		System.out.println();

		try {
			System.out.print("Enter amount for withdraw: ");
			double saque = sc.nextDouble();
			conta1.withdraw(saque);
			System.out.print("New balance: " + conta1.getBalance());

		} catch (Exception2 e) {
			System.out.println(e.getMessage());
		}

	}

}
