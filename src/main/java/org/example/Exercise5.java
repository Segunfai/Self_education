package org.example;

public class Exercise5 {
    public static void main(String[] args) {
        double hourlyRate = 20.5;
        int hoursPerWeek = 40;
        int weeksPerMonth = 4;
        double weeklySalary = (hourlyRate * hoursPerWeek) * 5;
        double monthlySalary = weeklySalary * weeksPerMonth;

        System.out.println("Недельная зарплата сотрудника: " + weeklySalary + "$");
        System.out.println("Месячная зарплата сотрудника: " + monthlySalary + "$");

    }
}
