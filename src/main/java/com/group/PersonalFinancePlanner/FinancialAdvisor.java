package com.group.PersonalFinancePlanner;

import java.util.ArrayList;
import java.util.List;

public class FinancialAdvisor {
    public static final double HOUSING_BUDGET_PERCENTAGE = 0.30;

    public static double GROCERY_BUDGET_PERCENTAGE = 0.15;

    public static final double RETIREMENT_CONTRIBUTION_PERCENTAGE = 0.15;

    public void calculateGroceryBudget(Client client) {
        if (client.isMarried()){
            GROCERY_BUDGET_PERCENTAGE = 0.30;
        }
    }

    public static String suggestHousingBudget(Client client) {
        int housingBudget = (int) (client.getNetMonthlyIncome() * HOUSING_BUDGET_PERCENTAGE);
        return "Recommended monthly housing budget: $" + housingBudget;
    }

    public static String suggestGroceryBudget(Client client) {
        int groceryBudget = (int) (client.getNetMonthlyIncome() * GROCERY_BUDGET_PERCENTAGE);
        return "Recommended monthly grocery budget: $" + groceryBudget;
    }

    public static String suggestRetirementContribution(Client client) {
        int retirementContribution = (int) (client.getNetMonthlyIncome() * RETIREMENT_CONTRIBUTION_PERCENTAGE);
        return "Recommended monthly retirement contribution: $" + retirementContribution;
    }

    public static List<String> generateFinancialTasks(Client client) {
        List<String> tasks = new ArrayList<>();
        int taskNumber = 1;

        if (client.getEmergencyFund().getBalance() < 1000) {
            tasks.add("\nStep " + taskNumber + ": Save $1,000 total for your starter emergency fund.");
            taskNumber++;
        }

        if (!client.getDebts().isEmpty()) {
            tasks.add("Step " + taskNumber + ": Pay off all non-mortgage debt starting with the smallest debts.");
            taskNumber++;
        }

        int desiredEmergencyFund = client.getNetMonthlyIncome() * 3; // Assuming 3 months of expenses as desired fund balance
        if (client.getEmergencyFund().getBalance() < desiredEmergencyFund) {
            tasks.add("Step " + taskNumber + ": Save a total of 3-6 months of expenses in a fully funded emergency fund.");
            taskNumber++;
        }

        if (client.getRetirementAccount().getBalance() == 0) {
            tasks.add("Step " + taskNumber + ": Invest 15% of your household income in retirement.");
            taskNumber++;
        }

        if (client.getNumOfChildren() > 0 && client.getEducationFund().getBalance() == 0) {
            tasks.add("Step " + taskNumber + ": Save for your children’s college fund.");
            taskNumber++;
        }

        if (client.getMortgage() != null && client.getMortgage().getPrincipal() > 0) {
            tasks.add("Step " + taskNumber + ": Pay off your home early.");
            taskNumber++;
        }

        if (tasks.isEmpty()) {
            tasks.add("Step " + taskNumber + ": Build wealth and give.");
        }

        return tasks;
    }

    public static void runFinancialAdvisor(Client client) {
        System.out.println(suggestHousingBudget(client));
        System.out.println(suggestGroceryBudget(client));
        System.out.println(suggestRetirementContribution(client));
        System.out.println(generateFinancialTasks(client));
    }
}
