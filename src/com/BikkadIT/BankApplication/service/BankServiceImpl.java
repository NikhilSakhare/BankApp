package com.BikkadIT.BankApplication.service;

import java.util.Scanner;

import com.BikkadIT.BankApplication.model.Account;

public class BankServiceImpl implements BankServiceI {

	Account acc= new Account();
	Scanner sc= new Scanner(System.in); 
	
	
	//To create Account
	@Override
	public void createAccount() {     
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter your Account Number");
		int accno =sc.nextInt();
		acc.setAccNo(accno);
		
		System.out.println("Enter your Name");
		String accName =sc.next();
		acc.setAccNAme(accName);
		
		System.out.println("Enter your address");
		String accAddr=sc.next();
		acc.setAccAddr(accAddr);
		
		System.out.println("Enter your PAN Number");
		String panNo = sc.next();
		acc.setAccPan(panNo);
		
		System.out.println("Enter amount to diposite");
		double accamt =sc.nextDouble();
		acc.setAccAmt(accamt);
		
		System.out.println("Congratulations!! Your Account Created Sucessfully");
		 
		
		}
	
	//To View Account
	@Override
	public void viewAccount() {
		
		
		System.out.println("Account Details By toStrng Method");
		System.out.println(acc);
		System.out.println("Account Details By Getter");
		System.out.println(acc.getAccNo());
		System.out.println(acc.getaccNAme());
		System.out.println(acc.getAccAddr());
		System.out.println(acc.getAccPan());
		System.out.println(acc.getAccAmt());
		
			
	}

	//To Withdraw 
	@Override
	public void withdraw() {
	
	System.out.println("Enter account Number");
	int userAcc = sc.nextInt();
	if (acc.getAccNo() == userAcc) {
	    System.out.println("Enter amount you want to withdraw");
	    double dbtAmt = sc.nextDouble();
	    if (dbtAmt <= acc.getAccAmt()) {
	    	double remainAmount = acc.getAccAmt() - dbtAmt;
	    	
	    	acc.setAccAmt(remainAmount);
	    	System.out.println("Withdraw Sucessful. Current Bal is "+acc.getAccAmt());
	    	
	    }else {
	    	System.out.println("InSufficient Fund");
	    }
		
	} else {
		System.out.println("Invalid Account No.");
	       }
	}

	//To Deposit
	@Override
	public void deposit() {
		System.out.println("Enter Account Number :");
		int userAcc = sc.nextInt();
		
		if(acc.getAccNo() ==userAcc) {
			System.out.println("Enter Amount to diposite ");
			double depAmt = sc.nextDouble();
			double remainAmount =acc.getAccAmt() + depAmt;   	
			acc.setAccAmt(remainAmount);
			
			System.out.println("Deposite sucessful. Current bal is." +acc.getAccAmt());
		}else {
			System.out.println("Invalid account Number");
		}
	}
	
	//To update Account
	
	@Override
	public void updateAccount() {
		boolean flag=true;
		while(flag) {
			System.out.println("Press 1 for update Name");
			System.out.println("Press 2 for upfate Address");
			System.out.println("Press 3 for update PanNO.");
			System.out.println("Press 4 for Exit");
			
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter Name you want to update  :");
				String name = sc.next();
				acc.setAccNAme(name);
				System.out.println("Name Updated Successfully Umdated name is:  " +acc.getaccNAme());
				break;
			case 2:
				System.out.println("Enter Address you want to update");
				String Address  = sc.next();
				acc.setAccAddr(Address);
				System.out.println("Address update Successfully updated Address is:  " +acc.getAccAddr());
				
				break;
			case 3:
				System.out.println("Enter PanNo you want to update :  ");
				String panNo =sc.next();
				System.out.println("PanNo update Successfully updated panNo is :  " +acc.getAccPan());
				break;
			case 4:
				flag=false;
				break;
				
			}
		}
		
	}
	
	//To exit Account
	
	public void EXIT() {
		// TODO Auto-generated method stub
		System.out.println("Thanks For Visiting Us...Visite Again!!");
		
	}
	
	

}
