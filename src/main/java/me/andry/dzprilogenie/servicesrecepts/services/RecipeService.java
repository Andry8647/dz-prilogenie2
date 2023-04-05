package me.andry.dzprilogenie.servicesrecepts.services;

import me.andry.dzprilogenie.servicesrecepts.Recipe;

import java.util.List;

public interface RecipeService {



    Object addRecipe(String name, int time, List<Object> ingredients, List<String> listShags);


    Object getRecipe(int id);


}
