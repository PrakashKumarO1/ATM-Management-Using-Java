package com.atm;

import java.util.HashMap;
import java.util.Map;
public class AtmoperationImpl implements AtmoperationInterf {
    ATM atm = new ATM();
    Map<Double, String> ministat = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is:" + atm.getBalance());
    }
    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministat.put(withdrawAmount, "Amountwithdrawn");
                System.out.println(withdrawAmount + "collect the cash");
                viewBalance();
                atm.setBalance(atm.getBalance() - withdrawAmount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
        else {
            System.out.println("Please Enter the Amount in multiple of 500S");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministat.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount + "Deposited Sucessfully!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }
    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> m : ministat.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());

        }

    }

}
