package com.rapidapi.example.tutorial.restTutorial.rest.client;

import com.rapidapi.example.tutorial.data.CovidCountryTotal;
import com.rapidapi.example.tutorial.data.CovidTotal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
public class COVIDRestClient {

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

    public COVIDRestClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }
    public CovidTotal getTotals() {
        CovidTotal total = null;
        try {
            URI uri;
            uri = new URI(covidUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName, apiKeyValue);
            headers.set(hostName, hostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<CovidTotal[]> totalEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    CovidTotal[].class);
            total = totalEntity.getBody()[0];

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return total;
    }






    public CovidCountryTotal getCountryTotals(String country) {
        CovidCountryTotal total = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set(apiKeyName, apiKeyValue);
            headers.set(hostName, hostValue);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            Map<String, String> params = new HashMap<String, String>();
            params.put("format", "json");
            params.put("name", country);

            HttpEntity<String> request = new HttpEntity<String>(headers);
            covidUrl = covidUrl + "?format={format}&name={name}";
            ResponseEntity<CovidCountryTotal[]> totalEntity = restTemplate.exchange(covidUrl, HttpMethod.GET,
                    request, CovidCountryTotal[].class, params);

            total = totalEntity.getBody()[0];

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return total;
    }
}