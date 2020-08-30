package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	InsuranceProducts insuranceProducts = new InsuranceProducts();

	//To display available insurance product
    insuranceProducts.getProductClass();

    //To diaplay only one product
        System.out.println(insuranceProducts.getInsuredProduct("Damage protection"));
        System.out.println(insuranceProducts.getProductName("Health"));


    //To display that product doesn't exist
        System.out.println(insuranceProducts.getInsuredProduct("Damage recovery"));
        System.out.println(insuranceProducts.getProductName("Travel"));

     //To add a new product
        System.out.println("\n\n");
     insuranceProducts.setInsuredProductClass("Travel","Both National and International");
     insuranceProducts.getProductClass();

     //To remove a valid product from the list
        System.out.println("\n\n");
        insuranceProducts.removeProduct("Travel");
        insuranceProducts.getProductClass();


     //To remove a invalid product
        System.out.println("\n\n");
        insuranceProducts.removeProduct("Family");
        insuranceProducts.getProductClass();


    //To update a valid product
        System.out.println("\n\n");
        insuranceProducts.updateProduct("Motor", "Damage protection care");
        insuranceProducts.getProductClass();




    //To update an invalid product
        System.out.println("\n\n");
        insuranceProducts.updateProduct("Travel", "Both National and International travel");
        insuranceProducts.getProductClass();



    //To use string
        System.out.println("\n\n");
        System.out.println(insuranceProducts.toString());


    }
}
