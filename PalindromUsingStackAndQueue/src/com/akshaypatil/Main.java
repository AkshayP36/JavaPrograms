package com.akshaypatil;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String string1= "Was it a car or a cat I saw?";
        String string2= "I did, did I?";
        String string3= "Tenet";
        String string4= "Just random string to check palindrom";
        System.out.println("First string palindrom check = "+checkPalindrom(string1));
        System.out.println("First string palindrom check = "+checkPalindrom(string2));
        System.out.println("First string palindrom check = "+checkPalindrom(string3));
        System.out.println("First string palindrom check = "+checkPalindrom(string4));
    }

    public static boolean checkPalindrom(String string){

        //defining stack and queue
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        //making string lower case
        string = string.toLowerCase();

        //removing secial characters from the string and storing them into stack and queue
        for(int i=0;i<string.length();i++){
            char stringchar = string.charAt(i);
            if(stringchar>='a' && stringchar<='z'){
                queue.addLast(stringchar);
                stack.push(stringchar);
            }
        }

        //comparing both queue and stack characters for palindrom
        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}
