package com.rapidapi.example.tutorial.restTutorial;

import com.rapidapi.example.tutorial.data.CovidCountryTotal;
import com.rapidapi.example.tutorial.data.CovidTotal;
import com.rapidapi.example.tutorial.restTutorial.rest.client.COVIDRestClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestTutorialApplicationTests {

	@Autowired
	COVIDRestClient covidClient;

	@Test
	public void testGetTotals() {
		CovidTotal totals = covidClient.getTotals();
		System.out.println("Confirmed: " + totals.getConfirmed());
		System.out.println("Deaths: " + totals.getDeaths());
		System.out.println("Recovered: " + totals.getRecovered());
		assertTrue(totals.getConfirmed()>0);
	}

	@Test
	public void testGetItalyTotals() {
		CovidCountryTotal countryTotals = covidClient.getCountryTotals("italy");
		System.out.println("Country: " + countryTotals.getCountry());

	}

}
