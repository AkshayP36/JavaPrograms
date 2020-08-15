public class LargestPrime {
    public static void main(String[] args){
        int number = 217;
        System.out.println("LPF = "+getLargestPrime(number));
    }
    public static int getLargestPrime(int number){
        if(number <=1)
            return -1;

        int largestPrime=number ;
        for(int i=2; i<number; i++){
            if(number%i==0){
               System.out.println("value of prime ="+i);
                largestPrime = i;
                /*for(int j=2; j<i; j++) {
                    if (i % j == 0) {

                        System.out.println("j = "+j);
                        largestPrime = j;

                    }
                }*/

            }
        }
        return  largestPrime;
    }

    }
}
