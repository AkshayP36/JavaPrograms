package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseLetter("abhd7625na**&^^jbjda132"));
    }
    public static String reverseLetter(final String str) {
        String reverseString1,reverseString="";
        reverseString1=str.replaceAll("[^a-z]","");
        for(int i=reverseString1.length()-1; i>=0; i--)
            reverseString=reverseString+reverseString1.charAt(i);
        return reverseString; //coding and coding..
    }
}
