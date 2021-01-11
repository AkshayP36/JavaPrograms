package com.example.demo.controllers;

import com.example.demo.data.NitrousOxideData;
import com.example.demo.services.NitrousOxideDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEarthController {

    @Autowired
    NitrousOxideDataService nitrousOxideDataService;

    @GetMapping("/nitrousoxidedata")
    public NitrousOxideData getNitrousOxideData(){
        try{

            return nitrousOxideDataService.getNitrousOxideData();

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
