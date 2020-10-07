package com.akshaypatil;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProgammingLanguages java = new ProgammingLanguages("Java", "Full");
        ProgammingLanguages javascript = new ProgammingLanguages("Jabascript","FrontEnd");
        ProgammingLanguages php = new ProgammingLanguages("PHP", "Full");
        ProgammingLanguages c = new ProgammingLanguages("C", "Full");
        LinkedList<ProgammingLanguages> progammingLanguages = new LinkedList<>();


        //Adding elements to the Linked list
        progammingLanguages.addFirst(php);
        progammingLanguages.addFirst(javascript);
        progammingLanguages.addFirst(java);

        Iterator i = progammingLanguages.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println("\n\n");
        progammingLanguages.addLast(c);
        i = progammingLanguages.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n\n");
        progammingLanguages.remove(0);
        i = progammingLanguages.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n\n----");
        progammingLanguages.clear();
        i = progammingLanguages.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
