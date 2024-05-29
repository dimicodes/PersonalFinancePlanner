package com.group.PersonalFinancePlanner;

public class Mortgage {
    private int principal;
    private double interestRate; // Annual interest rate
    private int monthlyPayment;

    public Mortgage(int principal, double interestRate, int monthlyPayment) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;
    }

    public Mortgage(double interestRate, int monthlyPayment) {
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}