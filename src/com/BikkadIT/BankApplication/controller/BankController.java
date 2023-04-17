package com.BikkadIT.BankApplication.controller;

import java.util.Scanner;

import com.BikkadIT.BankApplication.service.BankServiceImpl;

public class BankController {
	

	public static void main(String[] args) {
		BankServiceImpl bankServiceImpl = new BankServiceImpl();

		boolean flag=true;
		while(flag) {
		System.out.println("******* Welcome to Bank Of Maharashtra*************");
		System.out.println("press 1 for create Account ");
		System.out.println("press 2 for view Account ");
		System.out.println("press 3 for withdraw money  ");
		System.out.println("press 4 for deposit  money ");
		System.out.println("press 5 for update Account ");
		System.out.println("press 6 for EXIT  ");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			
			bankServiceImpl.createAccount();
			break;
		case 2:
			
			bankServiceImpl.viewAccount();
			break;
		case 3:
			bankServiceImpl.withdraw();
			break;
		case 4:
			bankServiceImpl.deposit();
			break;
		case 5:
			bankServiceImpl.updateAccount();
			break;
		case 6:
			flag=false;
			break;
		
		default:

			System.out.println("Invalid choice");
		}

	}
		System.out.println("Thanks for using Bank of Maharashtra Application..Visite Again!!");

}
}