package com.group.PersonalFinancePlanner;

public class Debt {
    private String debtType;
    private int balance;
    private double monthlyPayment;
    private double interestRate;

    public Debt(String debtType, int balance, double monthlyPayment, double interestRate) {
        this.debtType = debtType;
        this.balance = balance;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
    }

    public String getDebtType() {
        return debtType;
    }

    public void setDebtType(String debtType) {
        this.debtType = debtType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
