package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter locFile = new FileWriter("File.txt") ;

        locFile.write("Akshay's file");
        locFile.write("\nLets rock it!");
        locFile.close();
        }
    }

