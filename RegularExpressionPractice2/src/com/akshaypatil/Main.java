package com.akshaypatil;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> emailAddress = new HashMap<>();
        emailAddress.put("akshay", "abc.lmn@gmail.com");
        emailAddress.put("Alex","alex.abc@outlook.com");
        emailAddress.put("Maria","maria.lok@gmail.com");
        emailAddress.put("Vande", "vande.poiu@gmail.com");
        emailAddress.put("Perl","perl1457@hotmail.com");

        doesValidGmailAddress(emailAddress);
        numberOfValidGmailAddress(emailAddress);
        whomToAskMailDetailsAgain(emailAddress);
    }

    public static void doesValidGmailAddress(Map<String, String> emailAddress){
        String validity,temp;
        for(String key : emailAddress.keySet()) {
         temp = emailAddress.get(key);
            if(temp.matches(""))
            System.out.println(key + " having ");
        }
    }
    public static void numberOfValidGmailAddress(Map<String, String> emailAddress){

    }
    public static void whomToAskMailDetailsAgain(Map<String, String> emailAddress){

    }
}
