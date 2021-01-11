package com.example.demo.services;

import com.example.demo.data.NitrousOxideData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class NitrousOxideDataService {

    @Value("${rapidapi.nitrousoxide.url}")
    String nitrousOxideUrl;

    @Value("${rapidapi.key.nitrousoxide.name}")
    String apiKeyName;

    @Value("${rapidapi.key.nitrousoxide.value}")
    String apiKeyValue;

    @Value("${rapidapi.host.nitrousoxide.name}")
    String apiHostName;

    @Value("${rapidapi.host.nitrousoxide.value}")
    String apiHostValue;

    RestTemplate restTemplate;

    public NitrousOxideDataService(RestTemplateBuilder restTemplateBuilder){
        restTemplate=restTemplateBuilder.build();
    }

    public NitrousOxideData getNitrousOxideData(){
        NitrousOxideData nitrousOxideData=null;

        try{

            URI uri;
            uri=new URI(nitrousOxideUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName,apiKeyValue);
            headers.set(apiHostName,apiHostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request = new HttpEntity<String>(headers);

            ResponseEntity<NitrousOxideData[]> totalEntity= restTemplate.exchange(uri, HttpMethod.GET,
                    request, NitrousOxideData[].class);
            nitrousOxideData=totalEntity.getBody()[0];
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }


        return nitrousOxideData;
    }
}
