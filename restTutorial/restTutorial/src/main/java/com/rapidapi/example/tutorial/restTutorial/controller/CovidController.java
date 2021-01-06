package com.rapidapi.example.tutorial.restTutorial.controller;

import com.rapidapi.example.tutorial.data.CovidCountryTotal;
import com.rapidapi.example.tutorial.data.CovidTotal;
import com.rapidapi.example.tutorial.restTutorial.rest.client.COVIDRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {

    @Autowired
    COVIDRestClient MyClinet;

    @GetMapping("/test")
    public CovidTotal contactsIndividual() {
        try {

            return MyClinet.getTotals();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getCovidTotal")
    public CovidCountryTotal getCountryTotal() {
        try {

            return MyClinet.getCountryTotals("italy");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/")
    public String home() {

        return "Home page";
    }
}
