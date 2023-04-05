package me.andry.dzprilogenie.servicesrecepts.services;

import me.andry.dzprilogenie.servicesrecepts.Ingredient;
import me.andry.dzprilogenie.servicesrecepts.Recipe;

import java.util.List;

public interface IngredientService {



    Object addIngredient(String name, int quantity, String unitOfMeasurement);


    Object getIngredient(int id);
}
