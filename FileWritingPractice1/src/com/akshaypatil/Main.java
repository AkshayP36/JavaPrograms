package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter TestFile = new FileWriter("MyFile.txt");
        TestFile.write("Testing new file");
        TestFile.close();
    }
}
