package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	String string = "I don't like this nepotism. Government must ban live video streaming";
	string = string.replaceAll("[aeiou]","");
        System.out.println(string);
    }
}
