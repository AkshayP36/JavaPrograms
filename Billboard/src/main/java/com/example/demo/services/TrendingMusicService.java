package com.example.demo.services;

import com.example.demo.data.TrendingMusic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

@Component
public class TrendingMusicService {

    //defining instances to call from property file for the Response
    //calling a method containing business logic
    @Value("${rapidapi.billboard.url}")
    String covidUrl;

    @Value("${rapidapi.key.name}")
    String apiKeyName;

    @Value("${rapidapi.key.value}")
    String apiKeyValue;

    @Value("${rapidapi.host.name}")
    String hostName;

    @Value("${rapidapi.host.value}")
    String hostValue;

    RestTemplate restTemplate;

    public TrendingMusicService(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }
    public TrendingMusic[] getListOfTrendingMusic() {
        TrendingMusic[] musicList = null;
        try {
            URI uri;
            uri = new URI(covidUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName, apiKeyValue);
            headers.set(hostName, hostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<TrendingMusic[]> totalEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    TrendingMusic[].class);
            for(int i=0;i<100;i++) {
                musicList[i] = totalEntity.getBody()[i];
            }

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return musicList;
    }

}
