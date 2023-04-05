package me.andry.dzprilogenie.servicesrecepts.services;

import me.andry.dzprilogenie.servicesrecepts.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    public static long lastId = 0;
    Map<Long,Object> card =  new HashMap<>();

    @Override
    public Object addRecipe(String name, int time, List<Object> ingredients, List<String> listShags){
        List<Object> recipe = new ArrayList<>();
        recipe.add(name);
        recipe.add(time);
        recipe.add(ingredients);
        recipe.add(listShags);
        return card.put(lastId++, recipe);

    }

    @Override
    public Object getRecipe(int id){

        return (Recipe) card.get(id);
    }

}
