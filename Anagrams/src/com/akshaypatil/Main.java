package com.akshaypatil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;

        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] aa=new char[a.length()];
        char[] bb=new char[b.length()];

        for(int i=0; i<a.length(); i++){
            aa[i]=a.charAt(i);
            bb[i]=b.charAt(i);
        }

        Arrays.sort(aa);
        Arrays.sort(bb);

        for(int i=0; i<a.length(); i++){
            if(aa[i] != bb[i])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}







