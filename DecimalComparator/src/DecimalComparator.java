public class DecimalComparator {
    /*public static void main(String[] args){
        double firstValue = 4.0;
        double secondValue = 5.0;
        boolean areEqualByThreeDecimalPlaces= areEqualByThreeDecimalPlaces(firstValue,secondValue);
        System.out.println("output = "+areEqualByThreeDecimalPlaces);
    }*/
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        int firstValueInt = (int)(firstValue);
        System.out.println("f = "+firstValueInt);
        int secondValueInt = (int)(secondValue);
        System.out.println("S = "+secondValueInt);

        float firstValueRemoveBeforeDigits=(float)(firstValue%firstValueInt);
        System.out.println("f = "+firstValueRemoveBeforeDigits);
        float secondValueRemoveBeforeDigits=(float)(secondValue%secondValueInt);
        System.out.println("S = "+secondValueRemoveBeforeDigits);


        int firstNumber = (int)(firstValueRemoveBeforeDigits*1000);
        System.out.println("f = "+firstNumber);
        int secondNumber= (int)(secondValueRemoveBeforeDigits*1000);
        System.out.println("S = "+secondNumber);

        if (firstValue == 0.0 && secondValue==0.0)
            return true;
        else if(firstNumber==0.0 && secondNumber==0.0)
            return false;
        else if(firstNumber==secondNumber)
            return true;
        else
            return false;
    }
}
