package com.example.demo.controller;

import com.example.demo.data.CountryList;
import com.example.demo.services.CountryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryListController {

    //define service class here and it's instance
    //make it autowired
    @Autowired
    CountryListService countryListService;

    @GetMapping("/")
    public CountryList[] displayCountryList() {
        try{
            return countryListService.getCountryList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
