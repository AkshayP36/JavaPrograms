package com.akshaypatil;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.nextLine();
        String beta = scanner.nextLine();
        String gamma = scanner.nextLine();


        //passing parameters to check palindrome
        System.out.println("Is Palindrome = "+isPalindrome(alpha));
        System.out.println("Is Palindrome = "+isPalindrome(beta));
        System.out.println("Is Palindrome = "+isPalindrome(gamma));
    }

    public static boolean isPalindrome(String string){
        //defining stack and queue
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        string = string.toLowerCase();


        //removing special characters and storing them into stack and queue
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                stack.push(string.charAt(i));
                queue.addLast(string.charAt(i));
            }
        }


        //comparing characters to check palindrome condition
        while(!queue.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                return false;
            }
        }


        return true;

    }
}
