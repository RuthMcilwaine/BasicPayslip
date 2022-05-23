package com.jetbrains.ch11.three;

public class CheckingAcc extends Account {
    private double overDraftLimit = 250;

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAcc{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", overDraftLimit=" + overDraftLimit +
                '}';
    }
}
