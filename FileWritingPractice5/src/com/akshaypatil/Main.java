package com.akshaypatil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer, String> studentList = new HashMap<>();

        studentList.put(1, "Harshad");
        studentList.put(2, "Pinki");
        studentList.put(3, "Rajat");
        studentList.put(4,"Vrinda");
        studentList.put(5,"Roshni");

        FileWriter studentListFile = new FileWriter("StudentList.txt");
        for(int i : studentList.keySet())
            studentListFile.write(i+" : "+studentList.get(i)+"\n");

        studentListFile.close();

    }
}
