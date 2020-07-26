public class EvenDigitSum {
    /*public static void main(String[] args){
        int number = 123456789;
        System.out.println("sum of even digits = "+getEvenDigitSum(number));
    }*/
    public static int getEvenDigitSum(int number){
        if (number < 0)
            return -1;

        int digitOfNumber=0, remainder=0, sum=0;
        while(number!=0){
            remainder=number%10;
            number = number/10;
            digitOfNumber=digitOfNumber+1;

            if (digitOfNumber%2==0){
                sum=remainder+sum;
            }
        }
        return sum;


    }
}
