package com.thoughtworks.accountbalance;

/**
 * Created by Ellen on 6/7/2015.
 */
public class Account {

    private int currentBalance;

    public Account(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int deposit(int deposit) {
        return deposit + currentBalance;
    }

    public int withdraw(int withdrawal) {
        if(currentBalance - withdrawal < 0) {
            return currentBalance;
        }
        return currentBalance - withdrawal;
    }
}
