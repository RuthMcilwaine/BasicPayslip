package com.jetbrains.ch11.three;

public class SavingsAcc extends Account {
    private boolean overdrawn;

    public boolean isOverdrawn() {
        return overdrawn;
    }

    public void setOverdrawn(boolean overdrawn) {
        this.overdrawn = overdrawn;
    }

    @Override
    public String toString() {
        return "SavingsAcc{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", overdrawn=" + overdrawn +
                '}';
    }
}
