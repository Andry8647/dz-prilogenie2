package me.andry.dzprilogenie.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirsController {
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

}
