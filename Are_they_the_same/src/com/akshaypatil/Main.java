package com.akshaypatil;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361,121};
        System.out.println(comp(a,b));
    }
    public static boolean comp(int[] a, int[] b) {
        try {

            if (a.length == 0 && b.length == 0)
                return true;
            // if(a.length!=b.length)
            //    return false;
            boolean flag = false;
            for (int i = 0; i < b.length; i++) {
                a[i] = a[i] * a[i];
            }
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == b[i]) {
                        flag = true;
                        break;
                    } else
                        flag = false;
                }
                if (flag == false)
                    break;
            }
            return flag;
        }catch(NullPointerException e){
            return false;
        }
    }
}
