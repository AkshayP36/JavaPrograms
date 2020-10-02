package com.akshaypatil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String basic = "I am writing a code. Lets edit this string";

	//To replace a character from string including its occurances
        System.out.println(basic.replaceAll("I","Akshay"));

     //To count the number of occurances
     String basicUpdate = basic.replaceAll("[a]","");
        System.out.println("Number of occurance of 'a' = "+(basic.length()-basicUpdate.length()));

    //To check A followed by A
        String aChecker = "AAABNAIKA00PAA";
        String aNotVRegExp = "t[^v]";
      //  String aNotVRegExp = "t(?!v)";
       // Pattern aNotVPattern = Pattern.compile(tNotVRegExp);
        //Matcher aNotVMatcher = aNotVPattern.matcher(tvTest);
    String negativeLogic = "A(?=A)";
    Pattern negativeLogicPattern = Pattern.compile(negativeLogic);
    Matcher negativeLogicMatcher = negativeLogicPattern.matcher(aChecker);
        int count = 0;
        while(negativeLogicMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + negativeLogicMatcher.start() + " to " + negativeLogicMatcher.end());
        }

        System.out.println("\n\n---------------------------");
        String phone1="(000) 789-8078";
        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("isItAPhoneNumber? = "+phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}.*)"));
        System.out.println("doesLastMatches? = "+phone1.matches(".*[0-9]{4}$"));
        System.out.println("doesContains two spaces = "+phone1.matches(".*[ ]{2}.*"));

        //To check valid Gmail ID of user
        String email = "abc.lmn@outlook.com";
        System.out.println(email+" does it a valid mail? = "+email.matches(".*@gmail.com$"));
    }
}
