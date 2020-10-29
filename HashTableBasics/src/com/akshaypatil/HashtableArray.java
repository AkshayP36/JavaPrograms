package com.akshaypatil;

public class HashtableArray {
    private Employee[] hashtable;

    public HashtableArray(){
        hashtable = new Employee[10];
    }


    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null){
            System.out.println("Sorry, there's already an employee at mentioned position " +hashedKey);
        }
        else{
            hashtable[hashedKey] = employee;
        }
    }


    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }


    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(int i=0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }

}
