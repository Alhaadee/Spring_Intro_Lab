package com.example.task_01_names.controllers;

import com.example.task_01_names.models.Celebration;
import com.example.task_01_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping ("/greeting")
    public Greeting greeting(@RequestParam (name = "name", defaultValue = "Unknown User")String name,@RequestParam (name = "timeOfDay", defaultValue = "morning") String timeOfDay){
        return new Greeting(name,timeOfDay);
    }

    @GetMapping("/greeting/christmas")
    public Celebration celebration(){
        return  new Celebration("Merry Christmas!");
    }

}
