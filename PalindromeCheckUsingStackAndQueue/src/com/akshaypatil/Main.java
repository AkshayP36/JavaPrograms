package com.akshaypatil;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String mystring1= "Tenet";
        String mystring2 = "adaddada";
        String mystring3 = "@#@io";

        System.out.println("Checking palindrome = "+isPalindrome(mystring1));
        System.out.println("Checking palindrome = "+isPalindrome(mystring2));
        System.out.println("Checking palindrome = "+isPalindrome(mystring3));
    }

    public static boolean isPalindrome(String string){
        //defining stack and queue
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        string = string.toLowerCase();

        //removing special characters and storing them into stack and queue
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stack.push(string.charAt(i));
                queue.addLast(string.charAt(i));
            }
        }


        //checking palindrome conditions of a string
        while(!queue.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                return false;
            }
        }


        return true;
    }
}
