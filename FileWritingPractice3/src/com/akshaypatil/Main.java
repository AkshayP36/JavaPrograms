package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter newFile = new FileWriter("CheckFile.txt");
        newFile.write("Adding new line to the file");
        newFile.close();
    }
}
