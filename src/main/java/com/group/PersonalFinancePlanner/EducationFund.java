package com.group.PersonalFinancePlanner;

public class EducationFund {
    private int balance;
    private String savingsPlanType; // "529" or "ESA"

    public EducationFund(int balance, String savingsPlanType) {
        this.balance = balance;
        this.savingsPlanType = savingsPlanType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getSavingsPlanType() {
        return savingsPlanType;
    }

    public void setSavingsPlanType(String savingsPlanType) {
        this.savingsPlanType = savingsPlanType;
    }
}