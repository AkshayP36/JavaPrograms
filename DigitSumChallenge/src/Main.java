public class Main {
    public static void main(String[] args){
        int sum=sumDigit(-1587);
        System.out.println("Sum of digits = "+sum);
    }
    public static int sumDigit(int number){
        int sum=0;
        if (number>=10) {
            while (number!=0) {
                int leastDigit=number%10;
                number =number/10;
                sum = sum+leastDigit;
            }
            return sum;
        }
        else
            return -1;
    }
}
