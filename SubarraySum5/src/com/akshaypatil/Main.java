package com.akshaypatil;

public class Main {

    public static void main(String[] args) {

        //initializing array
        int[] myarray={1,3,1,-9,7,-6,5,-500};

        //finding sub array sum is 5

        boolean flag=false;
        for(int i=0;i<myarray.length;i++){
            int sum=myarray[i];
            for(int j=i;j<myarray.length;j++){

                sum=sum+myarray[j];
                if(sum==5) {
                    flag = true;
                    break;
                }

                System.out.println("myarray[i]="+myarray[i]+" myarray[j]="+myarray[j]+" sum="+sum);

            }
        }

        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
