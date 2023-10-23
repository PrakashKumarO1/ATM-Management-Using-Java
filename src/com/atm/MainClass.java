package com.atm;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		AtmoperationInterf op=new AtmoperationImpl();
		int atmnumber=7355;
		int atmpin=738046;
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to Atm Machine!!! ");
		System.out.println("Enter Atm Number:");
		int atmNumber=in.nextInt();
		System.out.println("Enter Atm Pin:");
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)) {
			System.out.println("Validation Done");
			while(true) {
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice:");
				int ch=in.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
				System.out.println("Enter Amount to Withdraw");
				double withdrawAmount=in.nextDouble(); 
				op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) {
				System.out.println("Enter Amount to Deposit:");
				double depositAmount=in.nextDouble();
				op.depositAmount(depositAmount);
				}
				else if (ch==4) {
					op.viewMiniStatement();
				}
				else if (ch==5) {
					System.out.println("Collect your card/Thankyou for using ATM Machine");
					System.exit(0);
				}
				else 
				{
					System.out.println("Please Enter Correct Choice");
				}	
			}
	    }
		else {
		System.out.println("Incorrect Number or pin");
		}
		
	}

}
