package me.andry.dzprilogenie.controllers;

import me.andry.dzprilogenie.servicesrecepts.Recipe;
import me.andry.dzprilogenie.servicesrecepts.services.IngredientService;
import me.andry.dzprilogenie.servicesrecepts.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirsController {
    private RecipeService recipeService;
    private IngredientService ingredientService;
    String name = "Приложения с рецептами";
    String userName = "Андрей Булыга";
    String projectFunctions = "Помощь с готовкой";
    String technologies = "Spring";
    String language = "Java";
    @GetMapping
    public String helloWord(){
        return "Приложение запущенно";
    }

    @GetMapping("/info")
    public String info(){
        return "Имя ученика: " + userName + "\n" +
                "Название вашего проекта: " + name + "\n" +
                "Дата создания проекта: " + "01.04.2023" + "\n" +
                "Описание проекта: " + projectFunctions + "\n" ;
    }

    @GetMapping("/recipe/how")
    public Object getRecipes(@RequestParam int id){
        return recipeService.getRecipe(id);
    }//Нахождение рецепта по id
    @GetMapping("/recipe/add")
    public Object addRecipes(@RequestParam String nameRecipe, @RequestParam int timeRecipe, @RequestParam List<Object> ingredient, @RequestParam List<String> shag){//Добавление рецепта

        return recipeService.addRecipe(nameRecipe,timeRecipe,ingredient,shag);
    }
    @GetMapping("/ingredient/how")
    public Object getIngredients(@RequestParam int id){
        return ingredientService.getIngredient(id);
    }//Нахождение Ингредиента по id
    @GetMapping("/ingredient/add")
    public Object addIngredients(@RequestParam String nameIngredients, @RequestParam int quantity, @RequestParam String unitOfMeasurement){//Добавление Ингредиента

        return ingredientService.addIngredient(nameIngredients,quantity,unitOfMeasurement);
    }



}
