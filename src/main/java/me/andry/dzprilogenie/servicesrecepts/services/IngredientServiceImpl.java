package me.andry.dzprilogenie.servicesrecepts.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service

public class IngredientServiceImpl implements IngredientService {
    public static long lastId = 0;
    Map<Long,Object> card =  new HashMap<>();

    @Override
    public Object addIngredient(String name, int quantity, String unitOfMeasurement){
        List<Object> ingredients = new ArrayList<>();
        ingredients.add(name);
        ingredients.add(quantity);
        ingredients.add(unitOfMeasurement);
        return card.put(lastId++, ingredients);

    }

    @Override
    public Object getIngredient(int id){

        return  card.get(id);
    }
}
