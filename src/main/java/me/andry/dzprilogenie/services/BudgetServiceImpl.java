package me.andry.dzprilogenie.services;

import java.time.LocalDate;

public class BudgetServiceImpl implements BudgetService {
     public static final int SALARY = 10_000;
    @Override
    public int getDailyBudget() {
        return SALARY/31;
    }

    @Override
    public int getBalance() {
        return SALARY- LocalDate.now().getDayOfMonth()*getDailyBudget();

    }
}
