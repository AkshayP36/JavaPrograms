package com.akshaypatil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Result {

    /*
     * Complete the 'maximumStones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maximumStones(List<Integer> arr) {
        // Write your code here
        int sumeven=0,sumodd=0;
        for(int i=0;i<arr.size();i++){
            if(i%2==0) sumeven=sumeven+arr.get(i);
            else sumodd=sumodd+arr.get(i);
        }

        if(sumodd<sumeven)
            return sumodd*2;
        else
        return sumeven*2;

    }

}
public class Main {

    public static void main(String[] args) {
       /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.maximumStones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */

        List<Integer> mylist= new ArrayList<>();
        mylist.add(2);
        mylist.add(1);
        mylist.add(2);
        int stone=Result.maximumStones(mylist);
        System.out.println("Max stone= "+stone);


    }
}
