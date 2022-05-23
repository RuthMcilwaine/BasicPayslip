package com.jetbrains.ch11.three;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        CheckingAcc checkingAcc = new CheckingAcc();
        SavingsAcc savingsAcc = new SavingsAcc();

        System.out.println(account);
        System.out.println(checkingAcc);
        System.out.println(savingsAcc);
    }
}
