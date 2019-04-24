package com.github.jotagit.controller.impl;

import com.github.jotagit.component.KafkaConsumidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {

    @Autowired
    KafkaConsumidor kafkaConsumidorImpl;

    @GetMapping
    @ResponseBody
    public String produtor(){
        return "Im alive!";
    }



}
