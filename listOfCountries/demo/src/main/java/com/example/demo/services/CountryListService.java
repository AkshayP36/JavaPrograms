package com.example.demo.services;

import com.example.demo.data.CountryList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

@Component
public class CountryListService {
    //define url,hostname,key-value
    //define a GET method to fetch data

    @Value("${rapidapi.covid.url}")
    String covidUrl;

    @Value("${rapidapi.key.name}")
    String apiKeyName;

    @Value("${rapidapi.key.value}")
    String apiKeyValue;

    @Value("${rapidapi.host.name}")
    String hostName;

    @Value("${rapidapi.host.covid.value}")
    String hostValue;

    RestTemplate restTemplate;

    public CountryListService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate=restTemplateBuilder.build();
    }

    public CountryList[] getCountryList(){
        CountryList[] countryList=null;

        try{
            URI uri;
            uri= new URI(covidUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName,apiKeyValue);
            headers.set(hostName,hostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<CountryList[]> totalEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    CountryList[].class);

            for(int i=0;i<200;i++) {
                countryList = totalEntity.getBody();
            }
        }
        catch(URISyntaxException e){
            e.printStackTrace();
        }

        return countryList;
    }
}
