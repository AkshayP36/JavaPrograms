package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }
    public static String SongDecoder (String song)
    {
        String a= song.replaceAll("[WUB]+$","");
        a=a.replaceAll("^(WUB)+", "");

        a=a.replaceAll("WUB"," ");

        a=a.replaceAll("[ ]+"," ");
                return a;
    }
}
