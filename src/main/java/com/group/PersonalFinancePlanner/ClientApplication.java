package com.group.PersonalFinancePlanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientApplication {

    static Client createClient(Scanner scanner) {
        // Collect Basic Client Info
        System.out.println("\nEnter full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Are you married? (yes/no):");
        boolean married = !scanner.nextLine().trim().equalsIgnoreCase("no");

        System.out.println("Enter number of children:");
        int numOfChildren = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter net monthly income (after tax):");
        int netMonthlyIncome = Integer.parseInt(scanner.nextLine());

        // Collect debts
        List<Debt> debts = new ArrayList<>(); // List where debts will be stored
        System.out.println("Do you have any debts? (yes/no)");
        String hasDebt = scanner.nextLine().trim().toLowerCase();
        while (hasDebt.equals("yes")) {
            System.out.println("Enter debt type (e.g., car, credit card, student loan):");
            String debtType = scanner.nextLine();
            System.out.println("Enter debt amount:");
            int debtAmount = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter monthly payment for the debt:");
            double monthlyPayment = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the interest rate on the debt (number only):");
            double interestRate = Double.parseDouble(scanner.nextLine());

            debts.add(new Debt(debtType, debtAmount, monthlyPayment, interestRate));

            System.out.println("Do you have another debt? (yes/no)");
            hasDebt = scanner.nextLine().trim().toLowerCase();
        }

        // Collect information about Emergency Fund
        EmergencyFund emergencyFund = null;
        System.out.println("Do you have an emergency fund set up? (yes/no)");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.println("Enter the current balance of your emergency fund:");
            int fundBalance = Integer.parseInt(scanner.nextLine());
            emergencyFund = new EmergencyFund(fundBalance);
        } else if (scanner.nextLine().trim().equalsIgnoreCase("no")) {
            int fundBalance = 0;
            emergencyFund = new EmergencyFund(fundBalance);
        }

        // Collect information about Retirement Account
        RetirementAccount retirementAccount = null;
        System.out.println("Do you have an retirement account set up? (yes/no)");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.println("Enter the current balance of your retirement account:");
            int retirementBalance = Integer.parseInt(scanner.nextLine());
            retirementAccount = new RetirementAccount(retirementBalance);
        } else if (scanner.nextLine().trim().equalsIgnoreCase("no")) {
            int retirementBalance = 0;
            retirementAccount = new RetirementAccount(retirementBalance);
        }

        // Education Fund
        EducationFund educationFund = null;
        System.out.println("Do you want to set up or have an education fund? (yes/no)");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.println("Enter the current balance of your education fund:");
            int educationBalance = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the type of savings plan (e.g., 529, ESA):");
            String savingsPlanType = scanner.nextLine();
            educationFund = new EducationFund(educationBalance, savingsPlanType);
        }

        // Mortgage
        Mortgage mortgage = null;
        System.out.println("Do you have a mortgage? (yes/no)");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
//            System.out.println("Enter the principal amount of the mortgage:");
//            int principal = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the interest rate of the mortgage (%):");
            double interestRate = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the monthly payment for the mortgage:");
            int monthlyPayment = Integer.parseInt(scanner.nextLine());
            mortgage = new Mortgage(interestRate, monthlyPayment);
        }

        return new Client(fullName, age, married, numOfChildren, netMonthlyIncome, debts,
                emergencyFund, retirementAccount, educationFund, mortgage);
    }
}