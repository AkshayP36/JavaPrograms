package com.akshaypatil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String basics = "Replace all blanks with underscores.";
        System.out.println(basics.replaceAll(" ", "_"));
        System.out.println("--------------------------");
        String statement1="I love bike";
        String statement2 = "I love book";
        String regEx = "I love \\w+.";
        System.out.println(statement1.matches(regEx));
        System.out.println(statement2.matches(regEx));
        System.out.println("--------------------------");
        String regEx2="I love (bike|book)";
        System.out.println(statement1.matches(regEx2));
        System.out.println(statement2.matches(regEx2));
        System.out.println("--------------------------");
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(statement1);
        System.out.println(matcher.matches());
        matcher.reset();
        matcher = pattern.matcher(statement2);
        System.out.println(matcher.matches());
        System.out.println("--------------------------");
    }
}
