package com.group.PersonalFinancePlanner;

import java.util.List;

public class Client {
    private String fullName;
    private int age;
    private boolean married;
    private int numOfChildren;
    private int netMonthlyIncome; // After tax income
    private List<Debt> debts;
    private EmergencyFund emergencyFund;
    private RetirementAccount retirementAccount;
    private EducationFund educationFund;
    private Mortgage mortgage;


    public Client(String fullName, int age, boolean married, int numOfChildren, int netMonthlyIncome, List<Debt> debts,
                  EmergencyFund emergencyFund, RetirementAccount retirementAccount,
                  EducationFund educationFund, Mortgage mortgage) {
        this.fullName = fullName;
        this.age = age;
        this.married = married;
        this.numOfChildren = numOfChildren;
        this.netMonthlyIncome = netMonthlyIncome;
        this.debts = debts;
        this.emergencyFund = emergencyFund;
        this.retirementAccount = retirementAccount;
        this.educationFund = educationFund;
        this.mortgage = mortgage;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public int getNetMonthlyIncome() {
        return netMonthlyIncome;
    }

    public void setNetMonthlyIncome(int netMonthlyIncome) {
        this.netMonthlyIncome = netMonthlyIncome;
    }

    public List<Debt> getDebts() {
        return debts;
    }

    public void setDebts(List<Debt> debts) {
        this.debts = debts;
    }

    public EmergencyFund getEmergencyFund() {
        return emergencyFund;
    }

    public void setEmergencyFund(EmergencyFund emergencyFund) {
        this.emergencyFund = emergencyFund;
    }

    public RetirementAccount getRetirementAccount() {
        return retirementAccount;
    }

    public void setRetirementAccount(RetirementAccount retirementAccount) {
        this.retirementAccount = retirementAccount;
    }

    public EducationFund getEducationFund() {
        return educationFund;
    }

    public void setEducationFund(EducationFund educationFund) {
        this.educationFund = educationFund;
    }

    public Mortgage getMortgage() {
        return mortgage;
    }

    public void setMortgage(Mortgage mortgage) {
        this.mortgage = mortgage;
    }
}
