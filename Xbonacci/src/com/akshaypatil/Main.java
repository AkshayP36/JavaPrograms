package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
        double[] s={0.0, 16.0, 0.0};
        int n=36;
        double[] l= new double[n];
        l=tribonacci(s,n);
        for(int i=0; i<n; i++){
            System.out.println(i+" = "+l[i]+" ");
        }

    }
    public static double[] tribonacci(double[] s, int n) {
        if(n<0)
            return null;
        long[] k = new long[n];
        if(n==0)
            return k;
        if(s.length==0){
            return null;
        }
        if(s.length==1){
            return null;
        }

        if(s.length==2){
            return null;
        }

        k[0]=s[0];
        k[1]=s[1];
        k[2]=s[2];

        for(int i=3; i<n; i++){
            k[i]= k[i-3]+k[i-2]+k[i-1];
        }
        return k;
    }
}
