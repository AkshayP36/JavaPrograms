package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter abc = new FileWriter("Test.txt");
        abc.write("Checking file IO");
        abc.close();
    }
}
