public class TeenNumberChecker {
    /*public static void main(String[] args){
        int firstValue=13;
        int secondValue=-5;
        int thirdValue=45;
        boolean hasTeen=hasTeen(firstValue,secondValue,thirdValue);
        System.out.println("hasTeen = "+hasTeen);
    }*/
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue){
        if((firstValue>=13 && firstValue<=19) || (secondValue>=13 && secondValue<=19) || (thirdValue>=13 && thirdValue<=19))
            return true;
        else return false;
    }
    public static boolean isTeen(int firstValue){
        if(firstValue>=13 && firstValue<=19)
            return true;
        else return false;
    }
}
