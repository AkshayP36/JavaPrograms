package com.akshaypatil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {
	// write your code here
        URL url = new URL("https://www.metaweather.com/api/location/search/?query=san");

        // Send Get request and fetch data

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(

                (conn.getInputStream())));


        // Read data line-by-line from buffer & print it out

        String output;

        while ((output = br.readLine()) != null) {

            System.out.println(output);

        }


        conn.disconnect();

    }
}
