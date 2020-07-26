public class SharedDigit {
    /*public static void main(String[] args){
        int firstNumber = 45;
        int secondNumber=75;
        System.out.println("the numbers "+firstNumber+" and "+secondNumber+" has shared digit = "+hasSharedDigit(firstNumber,secondNumber));
    }*/
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber<10 || firstNumber>99 || secondNumber<10 || secondNumber>99)
            return false;

        int unitDigitFirstNumber = firstNumber%10;
        int decimalPlaceFirstNumber = firstNumber/10;
        int unitDigitSecondNumber = secondNumber%10;
        int decimalPlaceSecondNumber = secondNumber/10;

        if (unitDigitFirstNumber==unitDigitSecondNumber || unitDigitFirstNumber==decimalPlaceSecondNumber || decimalPlaceFirstNumber==unitDigitSecondNumber || decimalPlaceFirstNumber==decimalPlaceSecondNumber)
            return true;
        else return false;
    }

}
