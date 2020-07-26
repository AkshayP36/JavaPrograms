public class EqualSumChecker {
    /*public static void main(String[] args){
        int firstValue=4;
        int secondValue=2;
        int thirdValue=6;
        boolean hasEqualSum=hasEqualSum(firstValue,secondValue,thirdValue);
        System.out.println("output = "+hasEqualSum);
    }*/
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue){
        if(thirdValue==firstValue+secondValue)
            return true;
        else
            return false;
    }

}
