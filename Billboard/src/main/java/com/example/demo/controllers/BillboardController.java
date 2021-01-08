package com.example.demo.controllers;

import com.example.demo.data.TrendingMusic;
import com.example.demo.services.TrendingMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillboardController {

    @Autowired
    TrendingMusicService trendingMusicService;

    @GetMapping("/test")
    public TrendingMusic[] getListOfTrendingMusic(){
        try{
            return trendingMusicService.getListOfTrendingMusic();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
