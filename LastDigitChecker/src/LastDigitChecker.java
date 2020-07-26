public class LastDigitChecker {
    /*public static void main(String[] args){
        int firstNumber = 45;
        int secondNumber = 78;
        int thirdNumber = 780;
        System.out.println("out = "+hasSameLastDigit(firstNumber, secondNumber, thirdNumber));

    }*/
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(isValid(firstNumber)==false || isValid(secondNumber)==false || isValid(thirdNumber)==false)
            return false;

        int unitFirstNumber = firstNumber%10;
        int unitSecondNumber = secondNumber%10;
        int unitThirdNumber = thirdNumber%10;

        if(unitFirstNumber==unitSecondNumber || unitFirstNumber==unitThirdNumber || unitSecondNumber==unitThirdNumber)
            return true;
        else return false;
    }
    public static boolean isValid( int number){
        if (number <10 || number >1000)
            return false;
            else return true;
    }
}
