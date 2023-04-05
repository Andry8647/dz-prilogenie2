package me.andry.dzprilogenie.controllers;

import me.andry.dzprilogenie.services.BudgetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget")

public class BudgetController {
    private BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/daily")
    public int dailyBudget(){
        return budgetService.getDailyBudget();
    }

    @GetMapping("/balance")
    public int balance(){
        return budgetService.getBalance();
    }
    @GetMapping("/vacation")
    public int vacationBonus(@RequestParam int vacationDays){
        return budgetService.getVacationBonus(vacationDays);
    }
    @GetMapping("/vacation/salary")
        public int salaryWithVacation(@RequestParam int vacationDays,@RequestParam int workingDays,@RequestParam int vacWorkDays){

        return budgetService.getSalaryWithVacation(vacationDays, workingDays, vacWorkDays);
    }


}
