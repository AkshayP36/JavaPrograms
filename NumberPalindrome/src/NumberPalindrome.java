public class NumberPalindrome {
    /*public static void main(String[] args){
        int number =789087;
        System.out.println("the number "+number+" is palindrome or not = "+isPalindrome(number));
    }*/
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int reverse=0,unitDigit=0,c=0,g=0;
        int storingNumber =number;
        while(number!=0){
            unitDigit =number%10;
            number=number /10;
            reverse=reverse *10 +unitDigit;
        }

        if(reverse==storingNumber)
        return true;
        else
            return false;

    }
}
