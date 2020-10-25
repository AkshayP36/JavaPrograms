package com.akshaypatil;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String alpha="I am groot!";
        String beta="Guardians of Galaxy!";
        String gamma = "GoGoaAogOg";
        System.out.println("Is string palindrome = "+isPalindrome(alpha));
        System.out.println("Is string palindrome = "+isPalindrome(beta));
        System.out.println("Is string palindrome = "+isPalindrome(gamma));
    }

    public static boolean isPalindrome(String string){
        //defining stack and queue
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        string = string.toLowerCase();


        //removing special characters from the string and storing them into stack and queue
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stack.push(string.charAt(i));
                queue.addLast(string.charAt(i));
            }
        }

        //comparing characters for palindrome
        if(!queue.isEmpty()){
            if(!queue.pop().equals(stack.remove()))
                return false;
        }


        return true;
    }
}
